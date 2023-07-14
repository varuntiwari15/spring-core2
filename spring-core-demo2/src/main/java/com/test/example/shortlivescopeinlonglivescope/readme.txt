

 issue--> BeanA (singleton) --> autowiring BeanB (prototype)--> when access --> singleton triggered
 means initiate only one time in context but BeanB is prototype needs multiple instances
 but BeanA is initiated only once so BeanB will be initiated only once (but needed multiple)
 run-1 - for problem creation
 to fix that issue we have multiple ways
1> if Singleton bean knows about changes every time when trying to initiate prototype bean
 so in singleton bean, inject ApplicationContext so singleton bean will be aware about prototype bean
 creation and processes -- run-2
 two ways--> use @Autowire (run-2) at ApplicationCOntext or use interface ApplicationContextAware(run-3)
disadvantage of using ApplicationContext -->
a> it will couple application code to Spring API
b> we are violating IOC principle, because spring is not injecting, we are manipulating that
1> 1.1 > using ApplicationContextAware interface --run-3
2> using Lookup method--> @Lookup--process of dynamically overriding a registered bean --> run-4
some restrictions for lookup method
The bean class cannot be final.
The method annotated with @Lookup, cannot be private , static or final
The factory approach of JavaConfig doesn't work i.e. a factory method annotated with @Bean
and returning a manually created instance of the bean doesn't work. Since the container is not
in charge of creating the instance, therefore it cannot create a runtime-generated subclass on the fly
3> Spring - Injecting a Bean as a class based Proxy Object--run-5
We need to inject a proxy object that exposes the same public interface as the original scoped object.
Spring uses CGLIB to create the proxy object. The proxy object delegates method calls to the real object.
Each access of underlying prototype object causes a new object to be created.
It will use CGLIB based proxy
4> Spring - Injecting a Bean as a JDK interface based Proxy Object--run-6
This mode needs to be specified if we are autowiring interface rather than a concrete class.
Spring injects JDK interface based proxy rather than CGLIB class based proxy.
5> Using JSR 330 Provider to Inject Short-lived Scoped Bean--run-7
use javax.inject.Provider<T> interface,
According to the specification, Provider.get() will always return the new instance of MyPrototypeBean.
6> Spring - Using ObjectProvider to Inject shorter-lived Scoped Bean into longer-lived Scoped Bean --run-8
7> Spring - Injecting Prototype Bean Using Java 8 Functions --run-9
We are going to inject java.util.function.Function into a singleton bean.
Whenever Function#apply() method is called, it will return a new instance of a prototype bean.


