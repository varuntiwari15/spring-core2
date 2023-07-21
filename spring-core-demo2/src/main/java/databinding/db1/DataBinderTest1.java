package databinding.db1;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.DataBinder;

public class DataBinderTest1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        testBean.setCount(25);
        System.out.println(testBean);
        System.out.println("****outside of spring context**********");
        TestBean tb1 = new TestBean();
        DataBinder dataBinder = new DataBinder(tb1);
        MutablePropertyValues mpv = new MutablePropertyValues();
        mpv.add("count", "12");
        dataBinder.bind(mpv);
        System.out.println(tb1);
    }
}
