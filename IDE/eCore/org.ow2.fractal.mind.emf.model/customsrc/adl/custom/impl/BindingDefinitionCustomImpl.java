package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.AdlPackage;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.Body;
import adl.Element;
import adl.InterfaceDefinition;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.BindingDefinitionHelper;
import adl.impl.BindingDefinitionImpl;

/**
 * <b>Class</b> <i>BindingDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class BindingDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link adl.custom.impl.AttributeDefinitionCustomImpl#getLinkedAnnotationsList <em>getLinkedAnnotationsList</em>}</li>
 * <li>
 * {@link adl.custom.impl.AttributeDefinitionCustomImpl#setLinkedAnnotationsList <em>setLinkedAnnotationsList</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends BindingDefinitionImpl
 */
public class BindingDefinitionCustomImpl extends BindingDefinitionImpl {

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSource()
	 */
	@Override
	public InterfaceDefinition getInterfaceSource() {
		if (interfaceSourceName != null
				&& !interfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName()
						.getDefaultValueLiteral())) {
			interfaceSource = getHelper().getInterfaceByName(interfaceSourceName, interfaceSourceParentName);
		}
		return super.getInterfaceSource();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTarget()
	 */
	@Override
	public InterfaceDefinition getInterfaceTarget() {
		if (interfaceTargetName != null
				&& !interfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName()
						.getDefaultValueLiteral())) {
			interfaceTarget = getHelper().getInterfaceByName(interfaceTargetName, interfaceTargetParentName);
		}
		return super.getInterfaceTarget();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceName()
	 */
	@Override
	public String getInterfaceSourceName() {
		if (interfaceSource != null) {
			interfaceSourceName = interfaceSource.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceSourceName,
				interfaceSourceParentName);
		interfaceSource = tmpInterfaceDefinition;
		return super.getInterfaceSourceName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetName()
	 */
	@Override
	public String getInterfaceTargetName() {
		if (interfaceTarget != null) {
			interfaceTargetName = interfaceTarget.getName();
		}
		InterfaceDefinition tmpInterfaceDefinition = getHelper().getInterfaceByName(interfaceTargetName,
				interfaceTargetParentName);
		interfaceTarget = tmpInterfaceDefinition;
		return super.getInterfaceTargetName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceSourceParentName()
	 */
	@Override
	public String getInterfaceSourceParentName() {
		ArchitectureDefinition parent = getInterfaceParent(interfaceSource);
		if (interfaceSource != null && parent!= null) {
			if (getHelper().getAdlDefinition() != null) {
				if (parent == getHelper().getAdlDefinition().getHelper()
								.getMainDefinition()) {
					interfaceSourceParentName = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceParentName()
							.getDefaultValueLiteral();
				}
				else {
					interfaceSourceParentName = parent.getName();
				}
			}
		}
		return super.getInterfaceSourceParentName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#getInterfaceTargetParentName()
	 */
	@Override
	public String getInterfaceTargetParentName() {
		ArchitectureDefinition parent = getInterfaceParent(interfaceTarget);
		if (interfaceTarget != null && parent != null) {
			if (getHelper().getAdlDefinition() != null) {
				if (parent == getHelper().getAdlDefinition().getHelper()
								.getMainDefinition()) {
					interfaceTargetParentName = AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetParentName()
							.getDefaultValueLiteral();
				}
				else {
					interfaceTargetParentName = parent.getName();
				}
			}
		}
		return super.getInterfaceTargetParentName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSource(adl.InterfaceDefinition )
	 */
	@Override
	public void setInterfaceSource(InterfaceDefinition newInterfaceSource) {
		ArchitectureDefinition parent = getInterfaceParent(newInterfaceSource);
		if (interfaceSource != newInterfaceSource) {
			super.setInterfaceSource(newInterfaceSource);
			if (newInterfaceSource != null) {
				interfaceSourceName = newInterfaceSource.getName();
				if (parent != null) interfaceSourceParentName = parent.getName();
			}
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
		if (interfaceTarget != newInterfaceTarget) {
			super.setInterfaceTarget(newInterfaceTarget);
			if (newInterfaceTarget != null) {
				interfaceTargetName = newInterfaceTarget.getName();
				if (parent != null) interfaceTargetParentName = parent.getName();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSourceName(java.lang.String)
	 */
	@Override
	public void setInterfaceSourceName(String newInterfaceSourceName) {
		if (newInterfaceSourceName != interfaceSourceName) {
			super.setInterfaceSourceName(newInterfaceSourceName);
			if (newInterfaceSourceName != null
					&& !newInterfaceSourceName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceName())) {
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceSourceName,
						interfaceSourceParentName);
				interfaceSource = tmpInterface;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTargetName(java.lang.String)
	 */
	@Override
	public void setInterfaceTargetName(String newInterfaceTargetName) {
		if (newInterfaceTargetName != interfaceTargetName) {
			super.setInterfaceTargetName(newInterfaceTargetName);
			if (newInterfaceTargetName != null
					&& !newInterfaceTargetName.equals(AdlPackage.eINSTANCE.getBindingDefinition_InterfaceTargetName())) {
				InterfaceDefinition tmpInterface = getHelper().getInterfaceByName(newInterfaceTargetName,
						interfaceTargetParentName);
				interfaceTarget = tmpInterface;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceSourceParentName(java.lang .String)
	 */
	@Override
	public void setInterfaceSourceParentName(String newInterfaceSourceParentName) {
		if (newInterfaceSourceParentName == null || !newInterfaceSourceParentName.equals(interfaceSourceParentName)) super
				.setInterfaceSourceParentName(newInterfaceSourceParentName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.BindingDefinitionImpl#setInterfaceTargetParentName(java.lang .String)
	 */
	@Override
	public void setInterfaceTargetParentName(String newInterfaceTargetParentName) {
		if (newInterfaceTargetParentName == null || !newInterfaceTargetParentName.equals(interfaceTargetParentName)) super
				.setInterfaceTargetParentName(newInterfaceTargetParentName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#getLinkedAnnotationsList()
	 */
	@Override
	public AnnotationsList getLinkedAnnotationsList() {
		Body parent = this.getParentBody();
		if (parent != null) {
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
		return linkedAnnotationsList;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ElementImpl#setLinkedAnnotationsList(adl.AnnotationsList)
	 */
	@Override
	public void setLinkedAnnotationsList(AnnotationsList newLinkedAnnotationsList) {
		Body parent = this.getParentBody();
		if (parent != null) {
			EList<Element> elements = parent.getElements();
			int index = elements.indexOf(this);
			if (index > 0 && elements.get(index - 1) instanceof AnnotationsList) linkedAnnotationsList = (AnnotationsList) elements
					.get(index - 1);
		}
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return BindingDefinitionHelper
	 * 
	 * @author proustr
	 */
	public BindingDefinitionHelper getHelper() {
		BindingDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, BindingDefinitionHelper.class);
		if (helper != null) {
			result = (BindingDefinitionHelper) helper;
		}
		return result;
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
		Body body = interfaceDefinition.getParentBody();
		if(body!=null)
		{
			return body.getParentComponent();
		}
		return null;
	}
	
}
