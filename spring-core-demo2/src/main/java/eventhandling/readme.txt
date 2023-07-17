-- Standard and Custom Events--
- some standard application level events- event firing and event listening-- based on Observer design pattern
- Also can create our custom events (firing + listening)
- some build-in events-
ContextStartedEvent--when application context started--context.start() called
ContextStoppedEvent--when application context stopped--context.stop() called
ContextClosedEvent--when application context closed--context.close() called
ContextRefreshedEvent--when application context gets initialized or refreshed--context.refresh() called
RequestHandledEvent--This event can be used only in spring mvc, it is called just after an HTTP
request is completed.
- How to listen events?--2 ways-1> use @EventListener on any method and pass
event-type (sub type of ApplicationEvent) as argument in method -- eh1
e.g.- @Component
      public class MyBean{
             @EventListener
             public void handleContextRefresh(ContextRefreshedEvent event) { ...  }}
2> We can implement ApplicationListener<E extends ApplicationEvent> to our bean and
implement the method  onApplicationEvent(E event) -- eh2
-- create custom event and handler/listener --eh3 --pending
- to create custom event publisher/listener-- we need to extent ApplicationEvent/ from spring 4.2
no need to extent ApplicationEvent class, to publish event-> use ApplicationEventPublisher or
ApplicationEventPublisherAware interface--> publishEvent method or one more method to publish events from context
directly as ACAC ctx = new ACAC(AppConfig.class); ctx.publishEvent(...) as context.publishEvent(...), as ApplicationContext
extends ApplicationEventPublisher
- to consume custom events- use either @EventListener or impl ApplicationListener
- custom event by extending ApplicationEvent and listener by impl ApplicationListener--eh3
-- without extending ApplicationEvent --eh4 --pending
-- we can also use @EventListener with multiple events together as
@EventListener({ContextRefreshedEvent.class, ContextStoppedEvent.class,
                ContextStartedEvent.class})
        public void handleContextEvent() { System.out.println("context event received "); }
-- Also we can put conditions on @EventListener as-
 @EventListener(condition = "#myEvent.code == 5")
        public void handleContextEvent(MyEvent myEvent) {
            System.out.println("event received: " + myEvent);
        }
-- Also we can transform one type of event to another type of event- also can say event chaining- means
at end of first event trigger second event--to do that we will return some thing from @EventListener
method -- eh5 --pending




