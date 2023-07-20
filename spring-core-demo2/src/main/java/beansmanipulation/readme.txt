---Spring-Manipulating java Beans---
Spring bean creration and manipulation is based on java beans.
there are many ways to manipulate java beans, some interfaces/classes present in spring framework
- basic interface is BeanWrapper- extends many interfaces-like- ConfigurablePropertyAccessor,
PropertyAccessor, PropertyEditorRegistry, TypeConverter
- we will focus on PropertyAccessor which gives methods to get/set property values
public interface BeanWrapper extends ConfigurablePropertyAccessor {
    .............
    Object getWrappedInstance(); //return the bean instance wrapped by this object
    Class<?> getWrappedClass(); //return type of wrapped bean instance
    PropertyDescriptor[] getPropertyDescriptors(); // for wrapped object
    PropertyDescriptor getPropertyDescriptor(String propertyName)
            throws InvalidPropertyException; // for specific property
}
-- definition of PropertyAccessor
public interface PropertyAccessor {
    .............
    boolean isReadableProperty(String propertyName); // property is readable or not
    boolean isWritableProperty(String propertyName); //property is writable or not
    @Nullable
    Class<?> getPropertyType(String propertyName) throws BeansException; //property type
    @Nullable
    TypeDescriptor getPropertyTypeDescriptor(String propertyName) throws BeansException; // type descriptor
    @Nullable
    Object getPropertyValue(String propertyName) throws BeansException; // get current value
    void setPropertyValue(String propertyName, @Nullable Object value)
            throws BeansException; //set current value
    void setPropertyValue(PropertyValue pv) throws BeansException; //set value
    void setPropertyValues(Map<?, ?> map) throws BeansException; //batch update
    void setPropertyValues(PropertyValues pvs) throws BeansException;
    void setPropertyValues(PropertyValues pvs, boolean ignoreUnknown)
            throws BeansException;
    void setPropertyValues(PropertyValues pvs, boolean ignoreUnknown, boolean ignoreInvalid)
            throws BeansException;
}
---
BeanWrapper--IMpl--BeanWrapperImpl
ConfigurablePropertyAccessor --impl-- DirectFieldAccessor--used to set field values directly
-another way to get BeanWrapper/DirectFieldAccessor instance is use of PropertyAccessorFactory-methods are-
public static BeanWrapper forBeanPropertyAccess(Object target)
public static ConfigurablePropertyAccessor forDirectFieldAccess(Object target)
-check bm1 -- used setPropertyValue(String propertyName, Object value)
-bm2 --setPropertyValue(PropertyValue pv)--> PropertyValue pv1 = new PropertyValue("name", "TEST");
-bm3 -- Using setPropertyValues(Map<?, ?> map), Using setPropertyValues(PropertyValues pvs)
-bm4 -- using PropertyAccessorFactory
-bm5 - Setting nested beans using BeanWrapper
-------------------------------
- Spring - Directly setting fields via DirectFieldAccess-- DirectFieldAccessor is another implementation
 of ConfigurablePropertyAccessor which can be used to directly setting/getting instance fields.
DirectFieldAccessor supports nested property paths and collection indexed access as well.- bm6
-- Spring - Obtaining BeanInfo And PropertyDescriptors--
- we can get bean info in two ways-
1> from JDK- interface- java.beans.Introspector
2> from Spring -a> interface- org.springframework.beans.BeanInfoFactory-one method- BeanInfo getBeanInfo(Class<?> beanClass)
b> using BeanWrapper, c> using BeanUtils --check-bm7
-- sometimes requirement is copy one bean properties to another bean properties
means source bean to target bean , copy properties- we can use BeanUtils-
it has overloaded method- copyProperties- check bm8

