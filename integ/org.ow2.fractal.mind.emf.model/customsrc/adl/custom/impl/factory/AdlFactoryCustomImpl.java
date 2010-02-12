/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.custom.impl.factory;

import adl.*;
import adl.custom.impl.*;
import adl.custom.util.adapters.factory.*;
import adl.impl.AdlFactoryImpl;
import adl.impl.AttributeDefinitionImpl;
import adl.impl.BindingDefinitionImpl;
import adl.impl.ComponentReferenceImpl;
import adl.impl.ComponentTypeDefinitionImpl;
import adl.impl.CompositeReferencesListImpl;
import adl.impl.DataDefinitionImpl;
import adl.impl.FileCImpl;
import adl.impl.ImplementationDefinitionImpl;
import adl.impl.InlineCodeCImpl;
import adl.impl.InterfaceDefinitionImpl;
import adl.impl.PrimitiveAnonymousSubComponentImpl;
import adl.impl.PrimitiveReferencesListImpl;
import adl.impl.PrimitiveSubComponentImpl;
import adl.impl.TemplateSubComponentImpl;
import adl.impl.TypeReferenceDefinitionImpl;
import adl.impl.TypeReferencesListImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdlFactoryCustomImpl extends AdlFactoryImpl  {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponentDefinition createCompositeComponentDefinition() {
		CompositeComponentDefinitionCustomImpl compositeComponentDefinition = new CompositeComponentDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(compositeComponentDefinition);
		return compositeComponentDefinition;
	}

	public AdlDefinition createAdlDefinition() {
		AdlDefinitionCustomImpl adlDefinition = new AdlDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(adlDefinition);
		return adlDefinition;
	}
	
	public CompositeSubComponent createCompositeSubComponent() {
		CompositeSubComponentCustomImpl compositeSubComponent = new CompositeSubComponentCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(compositeSubComponent);
		return compositeSubComponent;
	}
	
	public CompositeAnonymousSubComponent createCompositeAnonymousSubComponent() {
		CompositeAnonymousSubComponentCustomImpl compositeAnonymousSubComponent = new CompositeAnonymousSubComponentCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(compositeAnonymousSubComponent);
		return compositeAnonymousSubComponent;
	}
	
	public PrimitiveComponentDefinition createPrimitiveComponentDefinition() {
		PrimitiveComponentDefinitionCustomImpl primitiveComponentDefinition = new PrimitiveComponentDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(primitiveComponentDefinition);
		return primitiveComponentDefinition;
	}
	
	public PrimitiveReferenceDefinition createPrimitiveReferenceDefinition() {
		PrimitiveReferenceDefinition referenceDefinition = new PrimitiveReferenceDefinitionCustomImpl();
		//HelperAdapterFactory.getInstance().createAdapter(definition);
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}
	
	public CompositeReferenceDefinition createCompositeReferenceDefinition() {
		CompositeReferenceDefinitionCustomImpl referenceDefinition = new CompositeReferenceDefinitionCustomImpl();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}


	public PrimitiveReferencesList createPrimitiveReferencesList() {
		PrimitiveReferencesListImpl referenceList = (PrimitiveReferencesListImpl) super.createPrimitiveReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}

	public CompositeReferencesList createCompositeReferencesList() {
		CompositeReferencesListImpl referenceList = (CompositeReferencesListImpl) super.createCompositeReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}
	
	public TypeReferencesList createTypeReferencesList() {
		TypeReferencesListImpl referenceList = (TypeReferencesListImpl) super.createTypeReferencesList();
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceList);
		return referenceList;
	}
	
	public TypeReferenceDefinition createTypeReferenceDefinition() {
		TypeReferenceDefinitionImpl referenceDefinition = (TypeReferenceDefinitionImpl) super.createTypeReferenceDefinition();
		//HelperAdapterFactory.getInstance().createAdapter(definition);
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}

	public ComponentReference createComponentReference() {
		ComponentReferenceImpl referenceDefinition = (ComponentReferenceImpl) super.createComponentReference();
		//HelperAdapterFactory.getInstance().createAdapter(definition);
		AdlAdapterCustomFactory.getInstance().createAdapter(referenceDefinition);
		return referenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionCustomImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefinition createBindingDefinition() {
		BindingDefinitionImpl bindingDefinition = new BindingDefinitionCustomImpl();
		return bindingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeDefinition createComponentTypeDefinition() {
		ComponentTypeDefinitionImpl componentTypeDefinition = new ComponentTypeDefinitionCustomImpl();
		return componentTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefinition createDataDefinition() {
		DataDefinitionImpl dataDefinition = new DataDefinitionCustomImpl();
		return dataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileC createFileC() {
		FileCImpl fileC = new FileCCustomImpl();
		return fileC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDefinition createImplementationDefinition() {
		ImplementationDefinitionImpl implementationDefinition = new ImplementationDefinitionCustomImpl();
		return implementationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineCodeC createInlineCodeC() {
		InlineCodeCImpl inlineCodeC = new InlineCodeCCustomImpl();
		return inlineCodeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition createInterfaceDefinition() {
		InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionCustomImpl();
		return interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public PrimitiveAnonymousSubComponent createPrimitiveAnonymousSubComponent() {
		PrimitiveAnonymousSubComponentImpl primitiveAnonymousSubComponent = new PrimitiveAnonymousSubComponentCustomImpl();
		return primitiveAnonymousSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveSubComponent createPrimitiveSubComponent() {
		PrimitiveSubComponentImpl primitiveSubComponent = new PrimitiveSubComponentCustomImpl();
		return primitiveSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSubComponent createTemplateSubComponent() {
		TemplateSubComponentImpl templateSubComponent = new TemplateSubComponentCustomImpl();
		return templateSubComponent;
	}







}
