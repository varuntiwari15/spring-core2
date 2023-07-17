--Spring supports internationalization (I18n) and localization (L10n)
-different messages are written in *.properties file
- The main Spring interface to support of I18n/L10n messages is MessageSource
- some method - public interface MessageSource {
  @Nullable
  String getMessage(String code, @Nullable Object[] args, @Nullable String defaultMessage, Locale locale);.....
  String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException;
- code- key maps to key written in message properties file as- user.firstname
- args - runtime values for placeholder as- user.activity=this is activity {0}, done by {1}
- locale- Locale instance
- resolvable - MessageSourceResolvable is interface for message resolution dynamically. Spring core validation
error classes (FieldError, ObjectError) implement this interface, one impl- DefaultMessageSourceResolvable
- For interface MessageResource--> Spring provides two impl-
1> ResourceBundleMessageResource - internally uses java.util.ResourceBundle- message handling to underlying JDK ResourceBundle instance
2> ReloadableResourceBundleMessageResource- reload messages from source files bases on time stamp changes, without
restating the application, also can read xml property.
- we should follow some naming convention for message files-
basename_languageCode_countryCode.properties -- e.g.- orderView_en_us.properties,
file location-resources->messages->test_en_us.properties
-How to use MessageSource- only can inject, spring did not give annotation approach like Resource/@value and
PropertySource/@Value, reason- values resolved via annotation is static loaded at start time and remain same after that
but Locale in most case is dynamic based on client location based on HttpRequest(header-Accept-Language)
- check eg- package - inter1
- Also instead of interface MessageSource, we can use MessageSourceAware interface also
 public class TestBean implements MessageSourceAware {
        private MessageSource messageSource;
        public void printSomething () { ... }
        @Override
        public void setMessageSource (MessageSource messageSource) {this.messageSource = messageSource; }
- use of ReloadableResourceBundleMessageSource -- inter2
- multiple MessageSource--messageSource.setBasenames("messages/test1", "messages/test2");
- if there is some relation like Parent-Child in message source files-
 @Bean public MessageSource messageSource () {
            //child
            ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
            messageSource.setBasename("messages/msg2");
           //parent
            ResourceBundleMessageSource parentMessageSource = new ResourceBundleMessageSource();
            parentMessageSource.setBasename("messages/msg");
            messageSource.setParentMessageSource(parentMessageSource);
            return messageSource;
        }
- useful when we want to override some of messages from parent, child message source searched first for code, if message
is not found then parent is searched.
