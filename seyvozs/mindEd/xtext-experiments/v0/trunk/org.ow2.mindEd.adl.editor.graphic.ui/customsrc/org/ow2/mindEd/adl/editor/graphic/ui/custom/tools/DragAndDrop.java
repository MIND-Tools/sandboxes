package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.impl.TransactionImpl;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IDiagramPreferenceSupport;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.BasicDecorationNodeImpl;
import org.eclipse.gmf.runtime.notation.impl.ShapeImpl;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.FileC;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.PrimitiveComponentDefinition;
import org.ow2.mindEd.adl.PrimitiveReferencesList;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.custom.impl.CompositeBodyCustomImpl;
import org.ow2.mindEd.adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.FileCCustomImpl;
import org.ow2.mindEd.adl.custom.impl.ImplementationDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveBodyCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentCompositeBodyCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentPrimitiveBodyCustomImpl;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.commands.MindDiagramUpdateAllCommand;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.AdlDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeBodyCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeComponentDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeReferenceCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeReferencesListCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.CompositeReferencesListCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveBodyCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveComponentDefinitionCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveReferenceCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveReferencesListCompartmentCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.PrimitiveReferencesListCustomEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentCompositeBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.SubComponentPrimitiveBodyCompartmentEditPart;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;
import org.ow2.mindEd.adl.impl.CompositeReferenceDefinitionImpl;
import org.ow2.mindEd.adl.impl.PrimitiveReferencesListImpl;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindC;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindItf;

public class DragAndDrop {


	
	/**
	 * Create all command to create new object with Drag and Drop.
	 * @param listDropObject : list of MindFile selected
	 * @param targetEditPart : Edit Part of target Drop
	 * @param location : cursor location to drop element in this location.
	 * @return list of command for multi drop.
	 */
	public static List<Command> getListCommand(List<?> listDropObject, EditPart targetEditPart, Point location)
	{
		List<Command> commadList = new ArrayList<Command>();
		IElementType type = null;
		if ((listDropObject != null) && (targetEditPart != null))
		{
			for (Object object : listDropObject)
			{
				MindFile mindFile = null;
				if(object instanceof MindFile)
				{
					mindFile = (MindFile)object;
					GraphicalEditPart EP = null;
					if (targetEditPart instanceof GraphicalEditPart)
						EP = (GraphicalEditPart)targetEditPart;
					
					if(mindFile instanceof MindAdl)
					{
						// Type of Mind File is ADL
						if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
								|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
						{
							// If Drop on Composite Body or Sub-Component Composite Body
							// Create new Undefined Primitive Sub-Component
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.SubComponentDefinition_3153;
							else
								type = null;
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.PrimitiveComponentDefinition_2008;
							else
								type = null;
						}
						else if(targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
						{
							// If Drop on Primitive Sub Component
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.CompositeReferenceDefinition_3157;
							else
								type = null;
						}
						else if(targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart)
						{
							// If Drop on Primitive Component
							
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.PrimitiveReferencesList_3124;
							else
								type = null;
						}
						else if (targetEditPart instanceof PrimitiveComponentDefinitionCustomEditPart)
						{
							// If Drop on Primitive Reference List
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.PrimitiveReferenceDefinition_3125;
							else
								type = null;
						}
						else if(targetEditPart instanceof CompositeComponentDefinitionCustomEditPart)
						{
							// If Drop on Composite Reference List
							if(canDropMindAdl(EP,mindFile))
								type = MindElementTypes.CompositeReferenceDefinition_3102;
							else
								type = null;
						}
						else
						{
							System.out.println(targetEditPart.getClass().toString());
						}
					}
					if(mindFile instanceof MindC)
					{
						// Type of Mind File is MindC					
						if((targetEditPart instanceof CompositeBodyCompartmentCustomEditPart)
								|| (targetEditPart instanceof SubComponentCompositeBodyCompartmentEditPart))
						{
							// If Drop on Composite Body or Sub-Component Composite Body
							type = MindElementTypes.SubComponentDefinition_3135;
						}
						else if(targetEditPart instanceof AdlDefinitionCustomEditPart)
						{
							// If Drop on ADL Definition
							// Create new Primitive Component
							type = MindElementTypes.PrimitiveComponentDefinition_2008;
						}
						else if((targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
								|| (targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart))
						{
							// If Drop on Primitive Sub Component or Primitive Component
							if(targetEditPart instanceof SubComponentPrimitiveBodyCompartmentEditPart)
							{
								BasicDecorationNodeImpl model = (BasicDecorationNodeImpl) ((SubComponentPrimitiveBodyCompartmentEditPart)targetEditPart).getModel();
								SubComponentPrimitiveBodyCustomImpl component = (SubComponentPrimitiveBodyCustomImpl) model.getElement();
								List<Element> elementList = component.getElements();
								if(elementList.size() != 0)
								{
									type = MindElementTypes.ImplementationDefinition_3140;
									for (Element element : elementList)
									{
										if(element instanceof ImplementationDefinitionCustomImpl)
										{
											FileC fileC = ((ImplementationDefinitionCustomImpl)element).getFileC();
											if(fileC.getFileName().equals(mindFile.getQualifiedName()))
												type = null;
										}
									}
								}
								else
									type = MindElementTypes.ImplementationDefinition_3140;
							}
							else if(targetEditPart instanceof PrimitiveBodyCompartmentCustomEditPart)
							{
								BasicDecorationNodeImpl model = (BasicDecorationNodeImpl) ((PrimitiveBodyCompartmentCustomEditPart)targetEditPart).getModel();
								PrimitiveBodyCustomImpl component = (PrimitiveBodyCustomImpl) model.getElement();
								List<Element> elementList = component.getElements();
								if(elementList.size() != 0)
								{
									type = MindElementTypes.ImplementationDefinition_3140;
									for (Element element : elementList)
									{
										if(element instanceof ImplementationDefinitionCustomImpl)
										{
											FileC fileC = ((ImplementationDefinitionCustomImpl)element).getFileC();
											if(fileC.getFileName().equals(mindFile.getQualifiedName()))
												type = null;
										}
									}
								}
								else
									type = MindElementTypes.ImplementationDefinition_3140;
							}
							
						}
					}
					if(mindFile instanceof MindItf)
					{
						type = MindElementTypes.InterfaceDefinition_3130;
					}		
					
					Command com = null;
					if(type != null)
					{
						// Drop on Primitive Reference List
						if (type == MindElementTypes.PrimitiveReferenceDefinition_3125)
						{
							List<?> targetChildren = targetEditPart.getChildren();
							for(Object target : targetChildren)
							{
								// Search Primitive Reference List in Parent's Children
								if(target instanceof PrimitiveReferencesListCustomEditPart)
								{
									List<?> referencesChildren = ((PrimitiveReferencesListCustomEditPart)target).getChildren();
									for(Object refListChild : referencesChildren)
									{
										// search Reference List Compartment Edit Part
										if(refListChild instanceof PrimitiveReferencesListCompartmentCustomEditPart)
										{
											boolean newReference = true;
											List<?> referencesList = ((PrimitiveReferencesListCompartmentCustomEditPart) refListChild).getChildren();
											if(referencesList != null)
											{
												for(Object referenceListItem : referencesList)
												{
													// search Reference List Edit Part to Create Command
													if (referenceListItem instanceof PrimitiveReferenceCustomEditPart)
													{
														PrimitiveReferenceDefinitionCustomImpl primitiveReferenceDef = (PrimitiveReferenceDefinitionCustomImpl) ((ShapeImpl)((PrimitiveReferenceCustomEditPart) referenceListItem).getModel()).getElement();
														if(primitiveReferenceDef.getReferenceName().equals(mindFile.getQualifiedName()))
															newReference = false;
													}
												}
											}
											if (newReference)
											{
												Request request = createRequest(type,((PrimitiveReferencesListCompartmentCustomEditPart) refListChild).getViewer());
												com = ((PrimitiveReferencesListCompartmentCustomEditPart) refListChild).getCommand(request);
											}
										}
									}
								}
							}								
						}
						else if (type == MindElementTypes.CompositeReferenceDefinition_3102)
						{
							// Drop on Composite Reference List
							List<?> targetChildren = targetEditPart.getChildren();
							for(Object target : targetChildren)
							{
								// Search Composite Reference List in Parent's Children
								if(target instanceof CompositeReferencesListCustomEditPart)
								{
									List<?> referencesChildren = ((CompositeReferencesListCustomEditPart)target).getChildren();
									for(Object refListChild : referencesChildren)
									{
										// search Reference List Compartment Edit Part
										if(refListChild instanceof CompositeReferencesListCompartmentCustomEditPart)
										{
											boolean newReference = true;
											List<?> referencesList = ((CompositeReferencesListCompartmentCustomEditPart) refListChild).getChildren();
											if(referencesList != null)
											{
												for(Object referenceListItem : referencesList)
												{
													// search Reference List Edit Part to Create Command
													if (referenceListItem instanceof CompositeReferenceCustomEditPart)
													{
														CompositeReferenceDefinitionCustomImpl compositeReferenceDef = (CompositeReferenceDefinitionCustomImpl) ((ShapeImpl)((CompositeReferenceCustomEditPart) referenceListItem).getModel()).getElement();
														if(compositeReferenceDef.getReferenceName().equals(mindFile.getQualifiedName()))
															newReference = false;
													}
												}
											}
											if (newReference)
											{
												Request request = createRequest(type,((CompositeReferencesListCompartmentCustomEditPart) refListChild).getViewer());
												com = ((CompositeReferencesListCompartmentCustomEditPart) refListChild).getCommand(request);
											}
										}
									}
								}
							}
						}
						else
						{
							Request request = createRequest(type,EP.getViewer());
	
							if (request instanceof CreateViewRequest) {
								((CreateRequest) request).setLocation(location);
							}
							
							com = EP.getCommand(request);
						}
						
						if(com != null)
						{
							com.setLabel(mindFile.getFullpath());
							commadList.add(com);
						}
						
					}
					
					if(com == null)
					{
						Command unexecutableCommand = new Command(){
							@Override
							public boolean canExecute() {
								return false;
							}
						};
						unexecutableCommand.setLabel(mindFile.getFullpath());
						commadList.add(unexecutableCommand);
					}
				}
			}
		}
		
		
		return commadList;
	}

	/**
	 * Check if mindFile drop is not the MindAdl file associate to the Diagram
	 * @param EP : Target Edit Part
	 * @param mindFile : MindFile selected to the Drag&Drop
	 * @return boolean
	 */
	private static boolean canDropMindAdl(GraphicalEditPart EP,
			MindFile mindFile) {
/*
		EList<Resource> resources = EP.getEditingDomain().getResourceSet().getResources();
		URI resourceURI = null;
		for (Resource res : resources) {
		      if (res instanceof LazyLinkingResource) {
					resourceURI = res.getURI();
					IFile mindFileLinked = ModelToProjectUtil.INSTANCE.getIFile(resourceURI);
					String minFileLinkedPath = mindFileLinked.getFullPath().toString();
					if(minFileLinkedPath.equals((String)mindFile.getFullpath()))
		            {
		            	return false;
		            }
		            else
		            	return true;
		      }
		}
		return false;
*/
		return true;
	}

	/**
	 * Get list of command for Drag and Drop and execute. Set parameter according to MindFile
	 * @param listDropObject
	 * @param targetEditPart
	 * @param location
	 */
	public static void executeDrop(List<?> listDropObject, EditPart targetEditPart, Point location) {

		List<Command> listCommand = getListCommand(listDropObject, targetEditPart, location);
		MindFile mindFile = null;
		GraphicalEditPart EP = null;
		if (targetEditPart instanceof GraphicalEditPart)
			EP = (GraphicalEditPart)targetEditPart;
		
		for(Object object : listDropObject)
		{
			if((object instanceof MindAdl) 
					|| (object instanceof MindC)
					|| (object instanceof MindItf))
			{
				mindFile = (MindFile) object;
				for (Command command : listCommand)
				{
					if(mindFile.getFullpath().equals((String)command.getLabel()))
					{
						if(command.canExecute())
						{
							command.execute();
							Collection<?> temp = DiagramCommandStack.getReturnValues(command);
							@SuppressWarnings("unused")
							List<View> addedViews = getAddedViews(EP.getViewer(), DiagramCommandStack.getReturnValues(command));
							
							for(Object elementRequest : temp)
							{
								if(elementRequest instanceof CreateElementRequestAdapter)
								{
									CreateElementRequest request = (CreateElementRequest) ((CreateElementRequestAdapter)elementRequest).getAdapter(CreateElementRequest.class);
									Object element = request.getNewElement();
									
									TransactionImpl transaction = new TransactionImpl(EP.getEditingDomain(), false);
									
									try {
										transaction.start();

										if(mindFile instanceof MindAdl)
										{
											if (element instanceof PrimitiveReferenceDefinitionCustomImpl)
											{
												((PrimitiveReferenceDefinitionCustomImpl)element).setReferenceName(mindFile.getQualifiedName());
											}
											else if (element instanceof SubComponentDefinition)
											{
												CompositeReferenceDefinitionImpl newReferenceDefinition = new CompositeReferenceDefinitionImpl();
												newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
												((SubComponentDefinitionCustomImpl) element).setReferenceDefinition(newReferenceDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndex(EP,mindFile.getName(),"_adl"));
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												PrimitiveReferencesListImpl referenceList = new PrimitiveReferencesListImpl();
												PrimitiveReferenceDefinitionCustomImpl newReferenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
												newReferenceDefinition.setReferenceName(mindFile.getQualifiedName());
												((PrimitiveComponentDefinitionCustomImpl)element).setReferencesList(referenceList);
												newReferenceDefinition.setParentReferencesList(referenceList);
												((PrimitiveComponentDefinitionCustomImpl)element).setName(getNameComponentWithIndex(EP,mindFile.getName(),"_adl"));
											}
											else if (element instanceof CompositeReferenceDefinition)
											{
												((CompositeReferenceDefinitionCustomImpl)element).setReferenceName(mindFile.getQualifiedName());
											}
											else if (element instanceof PrimitiveReferencesList)
											{
												((PrimitiveReferencesListImpl)element).getReferences().get(0).setReferenceName(mindFile.getQualifiedName());
											}
										}
										else if(mindFile instanceof MindC)
										{
											if (element instanceof SubComponentDefinition) {
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												String[] fullPath = mindFile.getFullpath().split("/");
												String fileCName = fullPath[fullPath.length-1];
												String[] directory =  mindFile.getFullpath().split(fileCName);
												
												fileC.setDirectory(directory[0]);
												fileC.setFileName(fileCName);												
												implementationDefinition.setFileC(fileC);
												((SubComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((SubComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndex(EP,mindFile.getName(),"_c"));
											}
											else if(element instanceof PrimitiveComponentDefinition)
											{
												ImplementationDefinitionCustomImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
												FileCCustomImpl fileC = new FileCCustomImpl();
												String[] fullPath = mindFile.getFullpath().split("/");
												String fileCName = fullPath[fullPath.length-1];
												String[] directory =  mindFile.getFullpath().split(fileCName);
												
												fileC.setDirectory(directory[0]);
												fileC.setFileName(fileCName);										
												implementationDefinition.setFileC(fileC);
												((PrimitiveComponentDefinitionCustomImpl) element).getBody().getElements().add(implementationDefinition);
												((PrimitiveComponentDefinitionCustomImpl) element).setName(getNameComponentWithIndex(EP,mindFile.getName(),"_c"));
											}
											else if (element instanceof ImplementationDefinition)
											{
												FileCCustomImpl fileC = new FileCCustomImpl();
												String[] fullPath = mindFile.getFullpath().split("/");
												String fileCName = fullPath[fullPath.length-1];
												String[] directory =  mindFile.getFullpath().split(fileCName);
												
												fileC.setDirectory(directory[0]);
												fileC.setFileName(fileCName);
												((ImplementationDefinitionCustomImpl)element).setFileC(fileC);
											}
										}
										else if(mindFile instanceof MindItf)
										{
											if (element instanceof InterfaceDefinition)
											{
												((InterfaceDefinitionCustomImpl)element).setSignature(mindFile.getQualifiedName());
												((InterfaceDefinitionCustomImpl)element).setName(getNameInterfaceWithIndice((InterfaceDefinitionCustomImpl)element, mindFile.getName(), "_itf"));
											}
										}	
										
										transaction.commit();
										
									} catch (InterruptedException e) {
										e.printStackTrace();
									} catch (RollbackException e) {
										e.printStackTrace();
									}
									//Refresh
									MindDiagramUpdateAllCommand update = new MindDiagramUpdateAllCommand(true);
									try {
										update.execute(null);
									} catch (ExecutionException e) {
										e.printStackTrace();
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Get list of all sub-component name
	 * @param EP
	 * @return
	 */
	protected static List<String> getNameSubComponent(GraphicalEditPart EP)
	{
		List<?> children = EP.getChildren();
		List <String> componentName = new ArrayList<String>();
		for (Object child : children)
		{
			if(child instanceof GraphicalEditPart)
			{
				ShapeImpl model = (ShapeImpl) ((GraphicalEditPart)child).getModel();
				Object element = model.getElement();
				if (element instanceof SubComponentDefinition)
				{
					componentName.add(((SubComponentDefinition)element).getName());
				}
				else if(element instanceof PrimitiveComponentDefinition)
				{
					componentName.add(((PrimitiveComponentDefinition)element).getName());
				}
				else if(element instanceof CompositeComponentDefinition)
				{
					componentName.add(((CompositeComponentDefinition)element).getName());
				}
				
			}
		}
		return componentName;
	}
	
	/**
	 * Search if name+extension name existing for an other component and return the name with index if this name already existing.
	 * @param EP
	 * @param name
	 * @param extension
	 * @return unique name of component
	 */
	protected static String getNameComponentWithIndex(GraphicalEditPart EP, String name, String extension)
	{
		List <String> componentName = getNameSubComponent(EP);

		for(int i = 0;;i++)
		{
			if(i == 0)
			{
				if(!componentName.contains(name + extension))
				{
					return name + extension;
				}
			}
			else
			{
				if(!componentName.contains(name + extension + String.valueOf(i)))
				{
					return name + extension + String.valueOf(i);
				}
			}
		}
	}
	
	/**
	 * Search all interface name and generate a unique name with index
	 * @param interfaceDefinition
	 * @param name
	 * @param extension
	 * @return
	 */
	private static String getNameInterfaceWithIndice(
			InterfaceDefinitionCustomImpl interfaceDefinition, String name, String extension) {
		
		List <String> interfaceName = new ArrayList<String>();
		List <Element> elementList = null;

		Object body =interfaceDefinition.getParentBody();
		
		if (body instanceof SubComponentPrimitiveBodyCustomImpl)
		{
			elementList = ((SubComponentPrimitiveBodyCustomImpl)body).getElements();
		}
		else if(body instanceof CompositeBodyCustomImpl)
		{
			elementList = ((CompositeBodyCustomImpl)body).getElements();
		}
		else if(body instanceof PrimitiveBodyCustomImpl)
		{
			elementList = ((PrimitiveBodyCustomImpl)body).getElements();
		}
		else if(body instanceof SubComponentCompositeBodyCustomImpl)
		{
			elementList = ((SubComponentCompositeBodyCustomImpl)body).getElements();
		}
		
		for(Object element : elementList)
		{
			if(element instanceof InterfaceDefinition)
			{
				interfaceName.add(((InterfaceDefinition)element).getName());
			}
		}
		
		for(int i = 0;;i++)
		{
			if(i == 0)
			{
				if(!interfaceName.contains(name + extension))
				{
					return name + extension;
				}
			}
			else
			{
				if(!interfaceName.contains(name + extension + String.valueOf(i)))
				{
					return name + extension + String.valueOf(i);
				}
			}
		}
	}
	
	protected static Request createRequest(IElementType elementType, EditPartViewer viewer) {
		return CreateViewRequestFactory.getCreateShapeRequest(elementType,
			getPreferencesHint(viewer));
	}
	
	/**
	 * Gets the preferences hint that is to be used to find the appropriate
	 * preference store from which to retrieve diagram preference values. The
	 * preference hint is mapped to a preference store in the preference
	 * registry <@link DiagramPreferencesRegistry>.
	 * 
	 * @return the preferences hint
	 */
	protected static PreferencesHint getPreferencesHint(EditPartViewer viewer) {
		if (viewer != null) {
			RootEditPart rootEP = viewer.getRootEditPart();
			if (rootEP instanceof IDiagramPreferenceSupport) {
				return ((IDiagramPreferenceSupport) rootEP)
					.getPreferencesHint();
			}
		}
		return PreferencesHint.USE_DEFAULTS;
	}
	
	
	/**
	 * Select the newly added shape view by default
	 * @param viewer
	 * @param objects
	 */
	protected static List<View> getAddedViews(EditPartViewer viewer, Collection<?> objects) {
		final List<View> views = new ArrayList<View>();
		for (Iterator<?> i = objects.iterator(); i.hasNext();) {
			Object object = i.next();
			if (object instanceof IAdaptable) {
				Object view =
					((IAdaptable)object).getAdapter(View.class);
						
				if (view != null)
					views.add((View) view);
			}
		}
		return views;
	}
	
}
