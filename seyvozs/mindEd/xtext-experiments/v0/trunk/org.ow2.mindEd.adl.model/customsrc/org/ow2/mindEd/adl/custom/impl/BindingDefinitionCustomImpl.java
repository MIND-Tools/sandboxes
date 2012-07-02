package org.ow2.mindEd.adl.custom.impl;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.impl.BindingDefinitionImpl;

/**
 * <b>Class</b> <i>BindingDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class BindingDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>
 * {@link org.ow2.mindEd.adl.custom.impl.AttributeDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends BindingDefinitionImpl
 */
public class BindingDefinitionCustomImpl extends BindingDefinitionImpl {

	@Override
	public boolean isCanOverride() {
		return false;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSource()
	 */
	@Override
	public InterfaceDefinition getInterfaceSource() {
		InterfaceDefinition tmpinterface = getHelper().getInterfaceByName(interfaceSourceLabel, interfaceSourceParentLabel);
		if(tmpinterface!=null)interfaceSource = tmpinterface;
		return super.getInterfaceSource();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTarget()
	 */
	@Override
	public InterfaceDefinition getInterfaceTarget() {
		InterfaceDefinition tmpinterface = getHelper().getInterfaceByName(interfaceTargetLabel, interfaceTargetParentLabel);
		if(tmpinterface!=null)interfaceTarget = tmpinterface;
		return super.getInterfaceTarget();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceLabel()
	 */
	@Override
	public String getInterfaceSourceLabel() {
		return super.getInterfaceSourceLabel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetLabel()
	 */
	@Override
	public String getInterfaceTargetLabel() {
		return super.getInterfaceTargetLabel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceParentLabel()
	 */
	@Override
	public String getInterfaceSourceParentLabel() {
		return super.getInterfaceSourceParentLabel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetParentLabel()
	 */
	@Override
	public String getInterfaceTargetParentLabel() {
		return super.getInterfaceTargetParentLabel();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSource(adl.InterfaceDefinition )
	 */
	@Override
	public void setInterfaceSource(InterfaceDefinition newInterfaceSource) {
		ArchitectureDefinition parent = getInterfaceParent(newInterfaceSource);
		if(parent!=null)
		{
			interfaceSourceLabel = newInterfaceSource.getName();
			if(parent==getHelper().getMainDefinition())
			{
				interfaceSourceParentLabel = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceParentLabel().getDefaultValueLiteral();
			}
			else if (parent.getBody().eClass().getClassifierID() == AdlPackage.COMPOSITE_BODY)
				interfaceSourceParentLabel = null;
			else interfaceSourceParentLabel = parent.getSimpleName();
			super.setInterfaceSource(newInterfaceSource);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTarget(adl.InterfaceDefinition )
	 */
	@Override
	public void setInterfaceTarget(InterfaceDefinition newInterfaceTarget) {
		ArchitectureDefinition parent = getInterfaceParent(newInterfaceTarget);
		if(parent!=null)
		{
			interfaceTargetLabel = newInterfaceTarget.getName();
			if(parent==getHelper().getMainDefinition())
			{
				interfaceTargetParentLabel = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetParentLabel().getDefaultValueLiteral();
			}
			else if (parent.getBody().eClass().getClassifierID() == AdlPackage.COMPOSITE_BODY)
				interfaceTargetParentLabel = null;
			else interfaceTargetParentLabel = parent.getSimpleName();
			super.setInterfaceTarget(newInterfaceTarget);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setinterfaceSourceLabel(java.lang.String)
	 */
	@Override
	public void setInterfaceSourceLabel(String newinterfaceSourceLabel) {
		super.setInterfaceSourceLabel(newinterfaceSourceLabel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setinterfaceTargetLabel(java.lang.String)
	 */
	@Override
	public void setInterfaceTargetLabel(String newinterfaceTargetLabel) {
		super.setInterfaceTargetLabel(newinterfaceTargetLabel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setinterfaceSourceParentLabel(java.lang .String)
	 */
	@Override
	public void setInterfaceSourceParentLabel(String newinterfaceSourceParentLabel) {
		super.setInterfaceSourceParentLabel(newinterfaceSourceParentLabel);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setinterfaceTargetParentLabel(java.lang .String)
	 */
	@Override
	public void setInterfaceTargetParentLabel(String newinterfaceTargetParentLabel) {
		super.setInterfaceTargetParentLabel(newinterfaceTargetParentLabel);
	}

	
	/**
	 * <b>Method</b> <i>getInterfaceParent</i>
	 * <p>
	 * This methods the component that contains given interface.
	 * 
	 * @return ArchitectureDefinition
	 * 
	 * @author proustr
	 */	
	private ArchitectureDefinition getInterfaceParent(InterfaceDefinition interfaceDefinition)
	{
		if(interfaceDefinition==null)return null;
		Body body = interfaceDefinition.getParentBody();
		if(body!=null)
		{
			return body.getParentComponent();
		}
		return null;
	}
	
}
