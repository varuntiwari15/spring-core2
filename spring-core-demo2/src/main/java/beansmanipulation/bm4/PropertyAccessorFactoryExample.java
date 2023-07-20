package beansmanipulation.bm4;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.ConfigurablePropertyAccessor;
import org.springframework.beans.PropertyAccessorFactory;

public class PropertyAccessorFactoryExample {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = PropertyAccessorFactory.forBeanPropertyAccess(new User());
        beanWrapper.setPropertyValue("name", "test-5");
        beanWrapper.setPropertyValue("age", 25);
        System.out.println(beanWrapper.getWrappedInstance());
        System.out.println("************************");
        //ConfigurablePropertyAccessor name = PropertyAccessorFactory.forDirectFieldAccess("name");
    }
}
