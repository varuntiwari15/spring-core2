Spring - Profiles--
logical group of bean definitions to be registered with container
--> lets different currency beans are needs to be registered so we will create some profiles as
country_USA, country_CANADA, and create corresponding beans
--Profiles are useful for running application for different environment
e.g. development, test, production etc. We can select/deselect different beans in different environment.
-@Profile
--use different configuration for different profiles as--
@Configuration @Profile("dev") class DevConfiguration
@Configuration @Profile("prod") class ProdConfiguration
--Also can register different beans as per different profiles
--To activate profile--> two ways--
1> using JVM system property--> spring.profiles.active
2> using program--> ConfigurableEnvironment.setActiveProfiles(String...)
--default profile -->Naming a Profile as "default" , has special meanings, i.e.
if we don't activate any profile during startup, the "default" profile will be loaded along
with the beans which don't have any profile associations.
If we activate other profile, "default" will not be loaded. We can change "default" profile
name by using context.getEnvironment().setDefaultProfiles() or by using
the spring.profiles.default property.
see profile1--ex- we will create two DB access one- InMemory for "local" and JPA for "dev"
--Spring - Accessing Environment Properties--Environment in which application is running.
Environment (get active and default profiles) interface extends PropertyResolver (get properties)
property source can be util.Properties, loaded from a file or java system/env property file,
Map, if we are using Servlet container env-> source can be ServletContext or ServletConfig
ConfigurableEnvironment interface extends Environment and ConfigurablePropertyResolver
--> can get instance of CE via ConfigurableApplicationContext.getEnvironment(), its sub interface of ApplicationContext
-> Accessing properties with Environment--see env1
-- there are two property sources by default, System properties and System Environmental properties.
By default, system properties have precedence over environment variables
-We can add our own property sources to default properties as well-see package-env2
-Also we can directly add our property file to existing environment using @PropertySource
 instead of adding to existing property system programmatically-env3
 -- if we need some environment property in some bean we can direct autowire Environment in that
 bean definition--no need to get from application context object -- see env4
-- If we dont want to autowire Environment object every where but we want to access some properties
from property file--> we can use @Value("${firstname:demo}"), after colon default value if not found in
property file ad @PropertySource to tell spring where is file--> some time need to register a Bean named as
PropertySourcesPlaceholderConfigurer to understand spring to use @Value -- see env5
--Also we can use spring EL with @Value e.g-@Value("#{(5+6)}"), @Value("#{T(java.lang.Math).random()*1000}"),
@Value("#{systemProperties['user.home']}")



