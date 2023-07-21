--Property Editors--
-means- edit any property--means- convert text to other types and vice versa
-concept exist in java and spring both
- JDK- interface- PropertyEditor-methods- getAsText(), setAsText(String m)..
- Spring - complete package-org.springframework.beans.propertyeditors
- examples- ByteArrayPropertyEditor, CurrencyEditor, PropertiesEditor etc.
use case- in xml, beans defined, all properties defined in string, need to convert it to java objects
eg- if target bean's property is class type then spring uses ClassEditor to convert this
case-2-in spring mvc, all http request parameters are in text, Spring converts in java objects using editors.
case-3- by default fields having @Value , implicitly converted by an appropriate property editor
-- use of PropertyEditor via BeanWrapper- BeanWrapperImpl internally registers most propertyEditors,
means conversion can happen in side IOC conatiner, also outside by using BeanWrapper
-eg-how spring does auto conversion from string to date -- pe1
-Also we can create our own Editor and register to system, using JDK PropertyEditor- pe2
- How to access default property editor - pe3
- Property Editor with @Value - pe4
- We can also register our custom property editor using PropertyEditorRegistrar - pe5

