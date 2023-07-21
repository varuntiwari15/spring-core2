package databinding.db1;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DataBinder;

public class DataBinderTest2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.setCount(12);
        System.out.println(testBean);
        System.out.println("******outside spring context*******");
        TestBean tb2 = new TestBean();
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("count", "text"); // can not convert to int so error
        DataBinder db = new DataBinder(tb2);
        db.bind(mpv);
        db.getBindingResult().getAllErrors().forEach(System.out::println); // print all errors
        System.out.println(tb2);
        //output-TestBean{count=0}- if databinder find error for field, it will not do conversion
        // if we try wrapped object it will throw exception
        BeanWrapperImpl bw = new BeanWrapperImpl(new TestBean());
        bw.setPropertyValues(mpv);
        System.out.println(bw.getWrappedInstance()); // will throw exception in conversion

    }
}
