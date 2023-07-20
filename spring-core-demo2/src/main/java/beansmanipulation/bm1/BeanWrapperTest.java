package beansmanipulation.bm1;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class BeanWrapperTest {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(new User());
        beanWrapper.setPropertyValue("name", "Ravi");
        beanWrapper.setPropertyValue("age", 28);
        System.out.println("wrapped bean object: "+ beanWrapper.getWrappedInstance());
        System.out.println("propertyType : "+beanWrapper.getPropertyType("name"));
        System.out.println("propertyDescriptor : "+beanWrapper.getPropertyDescriptor("name"));
        System.out.println("propertyValue : "+beanWrapper.getPropertyValue("name"));
        System.out.println("propertyType : "+beanWrapper.getPropertyType("age"));
        System.out.println("propertyDescriptor : "+beanWrapper.getPropertyDescriptor("age"));
        System.out.println("propertyValue : "+beanWrapper.getPropertyValue("age"));
    }
}
