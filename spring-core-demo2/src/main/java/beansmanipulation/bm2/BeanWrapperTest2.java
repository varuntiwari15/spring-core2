package beansmanipulation.bm2;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest2 {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(new User());
        PropertyValue propertyValue1 = new PropertyValue("name", "Test-name");
        PropertyValue propertyValue2 = new PropertyValue("age", "29");
        beanWrapper.setPropertyValue(propertyValue1);
        beanWrapper.setPropertyValue(propertyValue2);
        System.out.println(beanWrapper.getWrappedInstance());
    }
}
