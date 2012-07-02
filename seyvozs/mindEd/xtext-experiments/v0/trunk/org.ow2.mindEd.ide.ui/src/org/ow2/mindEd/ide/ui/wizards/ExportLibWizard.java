package org.ow2.mindEd.ide.ui.wizards;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.ui.IExportWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.internal.ide.IDEWorkbenchMessages;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.eclipse.ui.internal.wizards.datatransfer.DataTransferMessages;
import org.eclipse.ui.internal.wizards.datatransfer.IFileExporter;
import org.eclipse.ui.internal.wizards.datatransfer.TarFileExporter;
import org.ow2.mindEd.ide.core.MindIdeCore;
import org.ow2.mindEd.ide.core.impl.MindProjectImpl;
import org.ow2.mindEd.ide.model.MindPathEntry;
import org.ow2.mindEd.ide.model.MindProject;
import org.ow2.mindEd.ide.model.MindRootSrc;
import org.ow2.mindEd.ide.ui.Activator;

public class ExportLibWizard extends Wizard implements IExportWizard {
	/** copy form org.eclipse.ui.internal.wizards.datatransfer.ZipFileExporter */
	static class ZipFileExporter implements IFileExporter {
	    protected ZipOutputStream outputStream;

	    private boolean useCompression = true;

	    /**
	     *	Create an instance of this class.
	     *
	     *	@param filename java.lang.String
	     *	@param compress boolean
	     *	@exception java.io.IOException
	     */
	    public ZipFileExporter(String filename, boolean compress) throws IOException {
	        outputStream = new ZipOutputStream(new FileOutputStream(filename));
	        useCompression = compress;
	    }

	    /**
	     *	Do all required cleanup now that we're finished with the
	     *	currently-open .zip
	     *
	     *	@exception java.io.IOException
	     */
	    public void finished() throws IOException {
	        outputStream.close();
	    }

	    /**
	     *	Write the contents of the file to the tar archive.
	     *
	     *	@param entry
	     *	@param contents
	     *  @exception java.io.IOException
	     *  @exception org.eclipse.core.runtime.CoreException
	     */
	    private void write(ZipEntry entry, IFile contents) throws IOException, CoreException {
	        byte[] readBuffer = new byte[4096];

	        // If the contents are being compressed then we get the below for free.
	        if (!useCompression) {
	            entry.setMethod(ZipEntry.STORED);
	        	InputStream contentStream = contents.getContents(false);
	        	int length = 0;
	            CRC32 checksumCalculator = new CRC32();
	            try {
	                int n;
	                while ((n = contentStream.read(readBuffer)) > 0) {
	                    checksumCalculator.update(readBuffer, 0, n);
	                    length += n;
	                }
	            } finally {
	                if (contentStream != null) {
						contentStream.close();
					}
	            }

	            entry.setSize(length);
	            entry.setCrc(checksumCalculator.getValue());
	        }

	        // set the timestamp
	        long localTimeStamp = contents.getLocalTimeStamp();
	        if(localTimeStamp != IResource.NULL_STAMP)
	        	entry.setTime(localTimeStamp);
	        
	        outputStream.putNextEntry(entry);
	    	InputStream contentStream = contents.getContents(false);
	        try {
	            int n;
	            while ((n = contentStream.read(readBuffer)) > 0) {
	                outputStream.write(readBuffer, 0, n);
	            }
	        } finally {
	            if (contentStream != null) {
					contentStream.close();
				}
	        }
	        outputStream.closeEntry();
	    }

	    public void write(IContainer container, String destinationPath)
	            throws IOException {
	        ZipEntry newEntry = new ZipEntry(destinationPath);
	        outputStream.putNextEntry(newEntry);
	    }

	    /**
	     *  Write the passed resource to the current archive.
	     *
	     *  @param resource org.eclipse.core.resources.IFile
	     *  @param destinationPath java.lang.String
	     *  @exception java.io.IOException
	     *  @exception org.eclipse.core.runtime.CoreException
	     */
	    public void write(IFile resource, String destinationPath)
	            throws IOException, CoreException {
	        ZipEntry newEntry = new ZipEntry(destinationPath);
	        write(newEntry, resource);
	    }
	}
	/**
	 * copy form org.eclipse.ui.internal.wizards.datatransfer.ArchiveFileExportOperation (change somme visibility to protected)
	 * @author chomats
	 *
	 */
	static class ArchiveFileExportOperation implements IRunnableWithProgress {
		protected IFileExporter exporter;

	    protected String destinationFilename;

	    private IProgressMonitor monitor;

	    private List resourcesToExport;

	    private IResource resource;

	    private List errorTable = new ArrayList(1); //IStatus

	    protected boolean useCompression = true;
	    
	    private boolean useTarFormat = false;

	    private boolean createLeadupStructure = true;

	    /**
	     *	Create an instance of this class.  Use this constructor if you wish to
	     *	export specific resources without a common parent resource
	     *
	     *	@param resources java.util.Vector
	     *	@param filename java.lang.String
	     */
	    public ArchiveFileExportOperation(List resources, String filename) {
	        super();

	        // Eliminate redundancies in list of resources being exported
	        Iterator elementsEnum = resources.iterator();
	        while (elementsEnum.hasNext()) {
	            IResource currentResource = (IResource) elementsEnum.next();
	            if (isDescendent(resources, currentResource)) {
					elementsEnum.remove(); //Removes currentResource;
				}
	        }

	        resourcesToExport = resources;
	        destinationFilename = filename;
	    }

	    /**
	     *  Create an instance of this class.  Use this constructor if you wish
	     *  to recursively export a single resource.
	     *
	     *  @param res org.eclipse.core.resources.IResource;
	     *  @param filename java.lang.String
	     */
	    public ArchiveFileExportOperation(IResource res, String filename) {
	        super();
	        resource = res;
	        destinationFilename = filename;
	    }

	    /**
	     *  Create an instance of this class.  Use this constructor if you wish to
	     *  export specific resources with a common parent resource (affects container
	     *  directory creation)
	     *
	     *  @param res org.eclipse.core.resources.IResource
	     *  @param resources java.util.Vector
	     *  @param filename java.lang.String
	     */
	    public ArchiveFileExportOperation(IResource res, List resources, String filename) {
	        this(res, filename);
	        resourcesToExport = resources;
	    }

	    /**
	     * Add a new entry to the error table with the passed information
	     */
	    protected void addError(String message, Throwable e) {
	        errorTable.add(new Status(IStatus.ERROR,
	                IDEWorkbenchPlugin.IDE_WORKBENCH, 0, message, e));
	    }

	    /**
	     *  Answer the total number of file resources that exist at or below self
	     *  in the resources hierarchy.
	     *
	     *  @return int
	     *  @param checkResource org.eclipse.core.resources.IResource
	     */
	    protected int countChildrenOf(IResource checkResource) throws CoreException {
	        if (checkResource.getType() == IResource.FILE) {
				return 1;
			}

	        int count = 0;
	        if (checkResource.isAccessible()) {
	            IResource[] children = ((IContainer) checkResource).members();
	            for (int i = 0; i < children.length; i++) {
					count += countChildrenOf(children[i]);
				}
	        }

	        return count;
	    }

	    /**
	     *	Answer a boolean indicating the number of file resources that were
	     *	specified for export
	     *
	     *	@return int
	     */
	    protected int countSelectedResources() throws CoreException {
	        int result = 0;
	        Iterator resources = resourcesToExport.iterator();
	        while (resources.hasNext()) {
				result += countChildrenOf((IResource) resources.next());
			}

	        return result;
	    }

	    /**
	     *  Export the passed resource to the destination .zip. Export with
	     * no path leadup
	     *
	     *  @param exportResource org.eclipse.core.resources.IResource
	     */
	    protected void exportResource(IResource exportResource)
	            throws InterruptedException {
	        exportResource(exportResource, 1);
	    }

	    /**
	     *  Export the passed resource to the destination .zip
	     *
	     *  @param exportResource org.eclipse.core.resources.IResource
	     *  @param leadupDepth the number of resource levels to be included in
	     *                     the path including the resourse itself.
	     */
	    protected void exportResource(IResource exportResource, int leadupDepth)
	            throws InterruptedException {
	        if (!exportResource.isAccessible()) {
				return;
			}

	        if (exportResource.getType() == IResource.FILE) {
	            String destinationName;
	            IPath fullPath = exportResource.getFullPath();
	            if (createLeadupStructure) {
					destinationName = fullPath.makeRelative().toString();
				} else {
					destinationName = fullPath.removeFirstSegments(
	                        fullPath.segmentCount() - leadupDepth).toString();
				}
	            monitor.subTask(destinationName);

	            try {
	                exporter.write((IFile) exportResource, destinationName);
	            } catch (IOException e) {
	                addError(NLS.bind(DataTransferMessages.DataTransfer_errorExporting, exportResource.getFullPath().makeRelative(), e.getMessage()), e);
	            } catch (CoreException e) {
	                addError(NLS.bind(DataTransferMessages.DataTransfer_errorExporting, exportResource.getFullPath().makeRelative(), e.getMessage()), e);
	            }

	            monitor.worked(1);
	            ModalContext.checkCanceled(monitor);
	        } else {
	            IResource[] children = null;

	            try {
	                children = ((IContainer) exportResource).members();
	            } catch (CoreException e) {
	                // this should never happen because an #isAccessible check is done before #members is invoked
	                addError(NLS.bind(DataTransferMessages.DataTransfer_errorExporting, exportResource.getFullPath()), e);
	            }

	            for (int i = 0; i < children.length; i++) {
					exportResource(children[i], leadupDepth + 1);
				}

	        }
	    }

	    /**
	     *	Export the resources contained in the previously-defined
	     *	resourcesToExport collection
	     */
	    protected void exportSpecifiedResources() throws InterruptedException {
	        Iterator resources = resourcesToExport.iterator();

	        while (resources.hasNext()) {
	            IResource currentResource = (IResource) resources.next();
	            exportResource(currentResource);
	        }
	    }

	    /**
	     * Returns the status of the operation.
	     * If there were any errors, the result is a status object containing
	     * individual status objects for each error.
	     * If there were no errors, the result is a status object with error code <code>OK</code>.
	     *
	     * @return the status
	     */
	    public IStatus getStatus() {
	        IStatus[] errors = new IStatus[errorTable.size()];
	        errorTable.toArray(errors);
	        return new MultiStatus(
	                IDEWorkbenchPlugin.IDE_WORKBENCH,
	                IStatus.OK,
	                errors,
	                DataTransferMessages.FileSystemExportOperation_problemsExporting,
	                null);
	    }

	    /**
	     *	Initialize this operation
	     *
	     *	@exception java.io.IOException
	     */
	    protected void initialize() throws IOException {
	    	if(useTarFormat) {
	    		exporter = new TarFileExporter(destinationFilename, useCompression);
	    	} else {
	        	exporter = new ZipFileExporter(destinationFilename, useCompression);
	    	}
	    }

	    /**
	     *  Answer a boolean indicating whether the passed child is a descendent
	     *  of one or more members of the passed resources collection
	     *
	     *  @return boolean
	     *  @param resources java.util.Vector
	     *  @param child org.eclipse.core.resources.IResource
	     */
	    protected boolean isDescendent(List resources, IResource child) {
	        if (child.getType() == IResource.PROJECT) {
				return false;
			}

	        IResource parent = child.getParent();
	        if (resources.contains(parent)) {
				return true;
			}

	        return isDescendent(resources, parent);
	    }

	    /**
	     *	Export the resources that were previously specified for export
	     *	(or if a single resource was specified then export it recursively)
	     */
	    public void run(IProgressMonitor progressMonitor)
	            throws InvocationTargetException, InterruptedException {
	        this.monitor = progressMonitor;

	        try {
	            initialize();
	        } catch (IOException e) {
	            throw new InvocationTargetException(e, NLS.bind(DataTransferMessages.ZipExport_cannotOpen, e.getMessage()));
	        }

	        try {
	            // ie.- a single resource for recursive export was specified
	            int totalWork = IProgressMonitor.UNKNOWN;
	            try {
	                if (resourcesToExport == null) {
						totalWork = countChildrenOf(resource);
					} else {
						totalWork = countSelectedResources();
					}
	            } catch (CoreException e) {
	                // Should not happen
	            }
	            monitor.beginTask(DataTransferMessages.DataTransfer_exportingTitle, totalWork);
	            if (resourcesToExport == null) {
	                exportResource(resource);
	            } else {
	                // ie.- a list of specific resources to export was specified
	                exportSpecifiedResources();
	            }

	            try {
	                exporter.finished();
	            } catch (IOException e) {
	                throw new InvocationTargetException(
	                        e,
	                        NLS.bind(DataTransferMessages.ZipExport_cannotClose, e.getMessage()));
	            }
	        } finally {
	            monitor.done();
	        }
	    }

	    /**
	     *	Set this boolean indicating whether each exported resource's path should
	     *	include containment hierarchies as dictated by its parents
	     *
	     *	@param value boolean
	     */
	    public void setCreateLeadupStructure(boolean value) {
	        createLeadupStructure = value;
	    }

	    /**
	     *	Set this boolean indicating whether exported resources should
	     *	be compressed (as opposed to simply being stored)
	     *
	     *	@param value boolean
	     */
	    public void setUseCompression(boolean value) {
	        useCompression = value;
	    }
	    
	    /**
	     * Set this boolean indicating whether the file should be output
	     * in tar.gz format rather than .zip format.
	     * 
	     * @param value boolean
	     */
	    public void setUseTarFormat(boolean value) {
	    	useTarFormat = value;
	    }
	}

	static class ExportLibOperartion extends ArchiveFileExportOperation implements IRunnableWithProgress {
	

		    private static final class ExtendedZipExporter extends ZipFileExporter {
			private ExtendedZipExporter(String filename, boolean compress)
					throws IOException {
				super(filename, compress);
			}

			public void write(String contents, String destinationPath) throws IOException {
				ZipEntry newEntry = new ZipEntry(destinationPath);
				outputStream.putNextEntry(newEntry);
				try {
		            outputStream.write(contents.getBytes());
		            
		        } finally {
		           
		        }
		        outputStream.closeEntry();
			}
		}


			private EList<MindPathEntry> mpe;

			/**
		     *  Create an instance of this class.  Use this constructor if you wish to
		     *  recursively export a n mindproject into mar library.
			 * @throws CoreException 
		     */
		    public ExportLibOperartion(MindProject[] projects, String destinationPath,
		            EList<MindPathEntry> mpe) throws CoreException {
		        super(getAllRootSrc(projects), destinationPath);
		        setCreateLeadupStructure(false);
		        this.mpe = mpe;
		    }

		    private static List getAllRootSrc(MindProject[] projects) throws CoreException {
				ArrayList<IResource> resources = new ArrayList<IResource>();
				 for (MindProject mp : projects) {
						for (MindRootSrc r : mp.getRootsrcs()) {
							IFolder rootRsc = MindIdeCore.getResource(r);
							resources.addAll(Arrays.asList(rootRsc.members()));
						}
					}
				return resources;
			}
		    
		    
		    @Override
		    protected void initialize() throws IOException {
		       exporter = new ExtendedZipExporter(destinationFilename, useCompression);
			   String mindPath = org.ow2.mindEd.ide.core.impl.MindProjectImpl.encodeMindpath(mpe, true);
			   ((ExtendedZipExporter) exporter).write(mindPath, MindProjectImpl.MINDLIB_FILENAME);
		    }

			
		
	}
	
	MindExportLibWizardPage page_1;
	private MindExportLibMPEWizardPage page_2;
	
	public ExportLibWizard() {
		IDialogSettings workbenchSettings = Activator.getDefault().getDialogSettings();
        IDialogSettings section = workbenchSettings
                .getSection("ExportLibWizard");//$NON-NLS-1$
        if (section == null) {
			section = workbenchSettings.addNewSection("ExportLibWizard");//$NON-NLS-1$
		}
        setDialogSettings(section);
	}
	
	@Override
	public void addPages() {
		super.addPages();
		page_1 = new MindExportLibWizardPage();
		page_2 = new MindExportLibMPEWizardPage();
		addPage(page_1);
		addPage(page_2);
	}
	
	/**
     * Save any editors that the user wants to save before export.
     * @return boolean if the save was successful.
     */
    protected boolean saveDirtyEditors() {
        return Activator.getDefault().getWorkbench().saveAllEditors(
                true);
    }
    
    /**
     * Display an error dialog with the specified message.
     *
     * @param message the error message
     */
    protected void displayErrorDialog(String message) {
        MessageDialog.open(MessageDialog.ERROR, getContainer().getShell(),
                "Export Mind mar library", message, SWT.SHEET);
    }

    /**
     * Display an error dislog with the information from the
     * supplied exception.
     * @param exception Throwable
     */
    protected void displayErrorDialog(Throwable exception) {
        String message = exception.getMessage();
        //Some system exceptions have no message
        if (message == null) {
			message = NLS.bind(IDEWorkbenchMessages.WizardDataTransfer_exceptionMessage, exception);
		}
        displayErrorDialog(message);
    }
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = super.getNextPage(page);
		if (nextPage == page_2) {
			page_2.setMindProjects(page_1.getMindProjects());
		}
		return nextPage;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setNeedsProgressMonitor(true);
	}

	@Override
	public boolean performFinish() {
		try {
			return executeExportOperation(new ExportLibOperartion(page_1.getMindProjects(), page_1.getDestinationPath(), page_2.getMindPath()));
		} catch (CoreException e) {
			displayErrorDialog(e);
            return false;
		}
	}
	
	 /**
     *  Set up and execute the passed Operation.  Answer a boolean indicating success.
     *
     *  @return boolean
     */
    protected boolean executeExportOperation(ExportLibOperartion op) {
        try {
            getContainer().run(true, true, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            displayErrorDialog(e.getTargetException());
            return false;
        }

        IStatus status = op.getStatus();
        if (!status.isOK()) {
            ErrorDialog.openError(getContainer().getShell(),
                    DataTransferMessages.DataTransfer_exportProblems,
                    null, // no special message
                    status);
            return false;
        }

        return true;
    }
}
