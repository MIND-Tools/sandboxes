/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.adl.custom.impl.factory;

import org.ow2.mindEd.adl.*;

import org.ow2.mindEd.adl.custom.adapters.factory.*;
import org.ow2.mindEd.adl.custom.impl.*;
import org.ow2.mindEd.adl.impl.AdlFactoryImpl;
import org.ow2.mindEd.adl.impl.AttributeDefinitionImpl;
import org.ow2.mindEd.adl.impl.BindingDefinitionImpl;
import org.ow2.mindEd.adl.impl.ComponentReferenceImpl;
import org.ow2.mindEd.adl.impl.ComponentTypeDefinitionImpl;
import org.ow2.mindEd.adl.impl.CompositeBodyImpl;
import org.ow2.mindEd.adl.impl.CompositeReferencesListImpl;
import org.ow2.mindEd.adl.impl.DataDefinitionImpl;
import org.ow2.mindEd.adl.impl.ImplementationDefinitionImpl;
import org.ow2.mindEd.adl.impl.InterfaceDefinitionImpl;
import org.ow2.mindEd.adl.impl.PrimitiveBodyImpl;
import org.ow2.mindEd.adl.impl.PrimitiveReferencesListImpl;
import org.ow2.mindEd.adl.impl.SubComponentCompositeBodyImpl;
import org.ow2.mindEd.adl.impl.SubComponentPrimitiveBodyImpl;
import org.ow2.mindEd.adl.impl.TypeBodyImpl;
import org.ow2.mindEd.adl.impl.TypeReferenceDefinitionImpl;
import org.ow2.mindEd.adl.impl.TypeReferencesListImpl;


/** <b>Class</b> <i>AdlFactoryCustomImpl</i><p>
 * This class overrides adl.impl.AdlFactoryImpl. It allows to remap Mind object creation on custom implementation classes. Each create function maps the object creation on the associated custom implementation class. This class is referenced in an extension of plugin.xml by factory_override emf class.
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AdlFactoryImpl
 */
public class AdlFactoryCustomImpl extends AdlFactoryImpl  {
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createSubComponentCompositeBody()
	 */
	@Override
	public SubComponentCompositeBody createSubComponentCompositeBody() {
		SubComponentCompositeBodyImpl subComponentCompositeBody = new SubComponentCompositeBodyCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(subComponentCompositeBody);
		return subComponentCompositeBody;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createSubComponentPrimitiveBody()
	 */
	@Override
	public SubComponentPrimitiveBody createSubComponentPrimitiveBody() {
		SubComponentPrimitiveBodyImpl subComponentPrimitiveBody = new SubComponentPrimitiveBodyCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(subComponentPrimitiveBody);
		return subComponentPrimitiveBody;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createCompositeComponentDefinition()
	 */
	public CompositeComponentDefinition createCompositeComponentDefinition() {
		CompositeComponentDefinitionCustomImpl compositeComponentDefinition = new CompositeComponentDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(compositeComponentDefinition);
		return compositeComponentDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createAdlDefinition()
	 */
	public AdlDefinition createAdlDefinition() {
		AdlDefinitionCustomImpl adlDefinition = new AdlDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(adlDefinition);
		return adlDefinition;
	}
	
	@Override
	public CompositeBody createCompositeBody() {
		CompositeBodyImpl compositeBody = new CompositeBodyCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(compositeBody);
		return compositeBody;
	}
	
	@Override
	public PrimitiveBody createPrimitiveBody() {
		PrimitiveBodyImpl primitiveBody = new PrimitiveBodyCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(primitiveBody);
		return primitiveBody;
	}
	
	@Override
	public TypeBody createTypeBody() {
		TypeBodyImpl typeBody = new TypeBodyCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(typeBody);
		return typeBody;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createPrimitiveComponentDefinition()
	 */
	public PrimitiveComponentDefinition createPrimitiveComponentDefinition() {
		PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = new PrimitiveComponentDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(primitiveComponentDefinition);
		return primitiveComponentDefinition;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createPrimitiveReferenceDefinition()
	 */
	public PrimitiveReferenceDefinition createPrimitiveReferenceDefinition() {
		PrimitiveReferenceDefinition referenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createCompositeReferenceDefinition()
	 */
	public CompositeReferenceDefinition createCompositeReferenceDefinition() {
		CompositeReferenceDefinitionCustomImpl referenceDefinition = new CompositeReferenceDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}


	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createPrimitiveReferencesList()
	 */
	public PrimitiveReferencesList createPrimitiveReferencesList() {
		PrimitiveReferencesListImpl referenceList = (PrimitiveReferencesListImpl) super.createPrimitiveReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createCompositeReferencesList()
	 */
	public CompositeReferencesList createCompositeReferencesList() {
		CompositeReferencesListImpl referenceList = (CompositeReferencesListImpl) super.createCompositeReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createTypeReferencesList()
	 */
	public TypeReferencesList createTypeReferencesList() {
		TypeReferencesListImpl referenceList = (TypeReferencesListImpl) super.createTypeReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}
	
	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createTypeReferenceDefinition()
	 */
	public TypeReferenceDefinition createTypeReferenceDefinition() {
		TypeReferenceDefinitionImpl referenceDefinition = new TypeReferenceDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createComponentReference()
	 */
	public ComponentReference createComponentReference() {
		ComponentReferenceImpl referenceDefinition = new ComponentReferenceCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createAttributeDefinition()
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionCustomImpl();
		return attributeDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createBindingDefinition()
	 */
	public BindingDefinition createBindingDefinition() {
		BindingDefinitionImpl bindingDefinition = new BindingDefinitionCustomImpl();
		return bindingDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createComponentTypeDefinition()
	 */
	public ComponentTypeDefinition createComponentTypeDefinition() {
		ComponentTypeDefinitionImpl componentTypeDefinition = new ComponentTypeDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(componentTypeDefinition);
		return componentTypeDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createDataDefinition()
	 */
	public DataDefinition createDataDefinition() {
		DataDefinitionImpl dataDefinition = new DataDefinitionCustomImpl();
		return dataDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createImplementationDefinition()
	 */
	public ImplementationDefinition createImplementationDefinition() {
		ImplementationDefinitionImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
		return implementationDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createInterfaceDefinition()
	 */
	public InterfaceDefinition createInterfaceDefinition() {
		InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionCustomImpl();
		return interfaceDefinition;
	}

	/* (non-Javadoc)
	 * @see adl.impl.AdlFactoryImpl#createTemplateSubComponent()
	 */
	public SubComponentDefinition createSubComponentDefinition() {
		SubComponentDefinitionCustomImpl subComponent = new SubComponentDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(subComponent);
		return subComponent;
	}
}
