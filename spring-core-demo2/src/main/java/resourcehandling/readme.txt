--RESOURCE HANDLING--
resources like file, web resources
-interface ResourceLoader is super interface of ApplicationContext, as its super so we can also use
it outside of spring container
-we can access resource using applicationContext instance, or can inject ResourceLoader as a bean
-method getResource(String location) ->location ex- file:C:/test.txt , url:http://www.test.com,
classpath:test.txt, relative path--WEB-INF/test.txt
- Resource interface extends InputStreamSource
- Multiple impl of Resource interface: FileSystemResource, ClassPathResource, UrlResource
- Prefix based resource location triggers and initializes related impl
-- We can use ResourceLoader and Resource interface outside of spring context -- see package - rh1
-ResourceLoader and Resource in spring --injecting ResourceLoader (its normal injecting) -- rh2
- without ResourceLoader, also we can use Resource directly with @Value annotation -- rh3
e.g. @Value("classpath:myResource.txt") private Resource myResource;
--Also we can inject Resource directly in any bean method also , e.g.
public void printData(@Value("classpath:test123.txt") Resource r) throws IOException{
File file = r.getFile();...
}

