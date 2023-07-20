package beansmanipulation.bm7;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;

public class BeanWrapperTest {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(User.class);
        PropertyDescriptor[] propertyDescriptors = beanWrapper.getPropertyDescriptors();
        for(PropertyDescriptor pd : propertyDescriptors){
            System.out.println("name : "+pd.getName());
            System.out.println("property type : "+ pd.getPropertyType());
            System.out.println("read method : "+ pd.getReadMethod());
            System.out.println("write method : "+ pd.getWriteMethod());
            System.out.println("-------------------");
        }

    }
}
