package org.ow2.mindEd.adl.editor.graphic.ui.custom.part;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.dnd.ByteArrayTransfer;
import org.eclipse.swt.dnd.TransferData;
import org.eclipse.ui.part.PluginTransferData;
import org.eclipse.ui.views.navigator.LocalSelectionTransfer;

/**
 * This class can be used to transfer an instance of <code>PluginTransferData</code>
 * between two parts in a workbench in a drag and drop operation.
 * <p>
 * In every drag and drop operation there is a <code>DragSource</code> and 
 * a <code>DropTarget</code>.  When a drag occurs a <code>Transfer</code> is 
 * used to marshall the drag data from the source into a byte array.  If a drop 
 * occurs another <code>Transfer</code> is used to marshall the byte array into
 * drop data for the target.
 * </p><p>
 * A <code>PluginTransferData</code> contains the id of a drop action extension.  
 * If a drop occurs the extension is invoked to perform a drop action.  As a benefit, 
 * the destination viewer doesn't need to have any knowledge of the items being 
 * dropped into it.  
 * </p><p>
 * This class can be used for a <code>Viewer<code> or an SWT component directly.
 * A singleton is provided which may be serially reused (see <code>getInstance</code>).  
 * It is not intended to be subclassed.
 * </p>
 *
 * @see org.eclipse.jface.viewers.StructuredViewer
 * @see org.eclipse.swt.dnd.DropTarget
 * @see org.eclipse.swt.dnd.DragSource
 */
public class CustomPluginTransfer extends ByteArrayTransfer {

    private static final String TYPE_NAME = "pluggable-transfer-format";//$NON-NLS-1$

    private static final int TYPEID = registerType(TYPE_NAME);

    /**
     * Singleton instance.
     */
    private static CustomPluginTransfer instance = new CustomPluginTransfer();

    /**
     * Creates a new transfer object.
     */
    private CustomPluginTransfer() {
        super();
    }

    /**
     * Returns the singleton instance.
     *
     * @return the singleton instance
     */
    public static CustomPluginTransfer getInstance() {
        return instance;
    }

    /* (non-Javadoc)
     * Method declared on Transfer.
     */
    protected int[] getTypeIds() {
        return new int[] { TYPEID };
    }

    /* (non-Javadoc)
     * Returns the type names.
     *
     * @return the list of type names
     */
    protected String[] getTypeNames() {
        return new String[] { TYPE_NAME };
    }

    /* (non-Javadoc)
     * Method declared on Transfer.
     */
    public void javaToNative(Object data, TransferData transferData) {
        PluginTransferData realData = (PluginTransferData) data;
        if (data == null) {
			return;
		}
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            DataOutputStream dataOut = new DataOutputStream(out);
            dataOut.writeUTF(realData.getExtensionId());
            dataOut.writeInt(realData.getData().length);
            dataOut.write(realData.getData());
            dataOut.close();
            super.javaToNative(out.toByteArray(), transferData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* (non-Javadoc)
     * Method declared on Transfer.
     */
    public Object nativeToJava(TransferData transferData) {
        try {
            byte[] bytes = (byte[]) super.nativeToJava(transferData);
            ByteArrayInputStream in = new ByteArrayInputStream(bytes);
            DataInputStream dataIn = new DataInputStream(in);
            String extensionName = dataIn.readUTF();
            int len = dataIn.readInt();
            byte[] pluginData = new byte[len];
            dataIn.readFully(pluginData);
            return new PluginTransferData(extensionName, pluginData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //can't get here
        return null;
    }
    
//    private ArrayList getRSESourceObjects(PluginTransferData transferData)
//	{
//		byte[] result = transferData.getData();
//
//		// get the sources	
//		String str = null;
//		try {
//			str = new String(result, "UTF-8"); //$NON-NLS-1$
//		}
//		catch (UnsupportedEncodingException e)
//		{
//			str = new String(result);
//		}
//		
//		String[] tokens = str.split("\\"); //$NON-NLS-1$
//		
//
//		ArrayList srcObjects = new ArrayList();
//		for (int i = 0;i < tokens.length; i++)
//		{
//			String srcStr = tokens[i];
//
//			{
//				Object srcObject = getObjectFor(srcStr);
//				srcObjects.add(srcObject);
//			}
//		}
//		return srcObjects;
//	}
//    
//    
//    
//    private ArrayList getSourceObjects(Object data)
//	{
//		ArrayList srcObjects = new ArrayList();
//
//		if (srcObjects.isEmpty())
//		{
//			if (data instanceof PluginTransferData)
//			{
//				PluginTransferData transferData = (PluginTransferData) data;
//					IStructuredSelection selection = (IStructuredSelection) LocalSelectionTransfer.getTransfer().getSelection();
//					Iterator selIt = selection.iterator();
//					while (selIt.hasNext())
//					{
//						srcObjects.add(selIt.next());
//					}
//					_sourceType = SystemDNDTransferRunnable.SRC_TYPE_ECLIPSE_RESOURCE;
//			}
//			// different kind of data            
//			else if (data instanceof IResource[])
//			{
//				IResource[] resources = (IResource[]) data;
//				for (int i = 0; i < resources.length; i++)
//				{
//					srcObjects.add(resources[i]);
//				}
//				_sourceType = SystemDNDTransferRunnable.SRC_TYPE_ECLIPSE_RESOURCE;
//			}
//			else if (data instanceof EditorInputTransfer.EditorInputData[])
//			{
//				EditorInputTransfer.EditorInputData[] editorInput = (EditorInputTransfer.EditorInputData[])data;
//				for (int i = 0; i < editorInput.length; i++)
//				{
//					IPersistableElement inData = editorInput[i].input.getPersistable();
//					if (inData instanceof FileEditorInput){
//						IFile file = ((FileEditorInput)inData).getFile();
//						srcObjects.add(file);
//					}
//				}	
//				_sourceType = SystemDNDTransferRunnable.SRC_TYPE_ECLIPSE_RESOURCE;
//			}
//			else if (data instanceof String[])
//			{
//				String[] resources = (String[]) data;
//				for (int i = 0; i < resources.length; i++)
//				{
//					String resource = resources[i];
//					srcObjects.add(resource);
//				}
//				_sourceType = SystemDNDTransferRunnable.SRC_TYPE_OS_RESOURCE;
//			}
//		}
//
//		return srcObjects;
//	}
    
    
    /**
	 * Method for decoding an source object ID to the actual source object.
	 * We determine the profile, connection and subsystem, and then
	 * we use the SubSystem.getObjectWithKey() method to get at the
	 * object.
	 *
	 */
//	private Object getObjectFor(String str)
//	{
//		ISystemRegistry registry = RSECorePlugin.getTheSystemRegistry();
//		// first extract subsystem id
//		int connectionDelim = str.indexOf(":"); //$NON-NLS-1$
//		if (connectionDelim == -1) // not subsystem, therefore likely to be a connection
//		{
//		    int profileDelim = str.indexOf("."); //$NON-NLS-1$
//			if (profileDelim != -1) 
//			{
//			    String profileId = str.substring(0, profileDelim);
//			    String connectionId = str.substring(profileDelim + 1, str.length());
//			    ISystemProfile profile = registry.getSystemProfile(profileId);
//			    return registry.getHost(profile, connectionId);
//			}
//		}
//		
//		
//		int subsystemDelim = str.indexOf(":", connectionDelim + 1); //$NON-NLS-1$
//		if (subsystemDelim == -1) // not remote object, therefore likely to be a subsystem
//		{
//		    return registry.getSubSystem(str);
//		}
//		else
//		{
//			String subSystemId = str.substring(0, subsystemDelim);
//			String srcKey = str.substring(subsystemDelim + 1, str.length());
//	
//		
//			ISubSystem subSystem = registry.getSubSystem(subSystemId);
//			if (subSystem != null)
//			{
//				Object result = null;
//				try
//				{
//					result = subSystem.getObjectWithAbsoluteName(srcKey);
//				}
////				catch (SystemMessageException e)
////				{
////					return e.getSystemMessage();
////				}
//				catch (Exception e)
//				{
//				}
//				if (result != null)
//				{
//					return result;
//				}
//				else
//				{
////					SystemMessage msg = RSEUIPlugin.getPluginMessage(ISystemMessages.MSG_ERROR_FILE_NOTFOUND);
////					msg.makeSubstitution(srcKey, subSystem.getHostAliasName());
////					return msg;
//				}
//			}
//			else
//			{
////				SystemMessage msg = RSEUIPlugin.getPluginMessage(ISystemMessages.MSG_ERROR_CONNECTION_NOTFOUND);
////				msg.makeSubstitution(subSystemId);
////				return msg;
//			}
//		}
//	}
}
