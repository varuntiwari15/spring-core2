---Data Binding----
- data binding --means bind input data (client data) to output data (bean data)
- means already we know that BeanWrapper is setting properties then why data binding?
- Actually BeanWrapper is doing only mapping but DataBinder is also doing other stuff like
field validation, field formatting, and binding result analysis
- BeanWrapper is a low level class, while DataBinder is higher level class
- Both BeanWrapper and DataBinder uses PropertyEditors to parse and format property values
- Infact DataBinder internally uses BeanWrapper
- WebDataBinder extends DataBinder and used in spring mvc- to manipulate request params
- check- db1--normal as BeanWrapper does
- db1-DataBinderTest2 - additional advantages of DataBinder- use BindingResult- if there is some issue in binding
then all errors/info will be in BindingResult object