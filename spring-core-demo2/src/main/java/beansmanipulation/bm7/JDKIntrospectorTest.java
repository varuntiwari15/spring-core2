package beansmanipulation.bm7;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class JDKIntrospectorTest {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor pd : propertyDescriptors){
            System.out.println("name : "+pd.getName());
            System.out.println("property type : "+ pd.getPropertyType());
            System.out.println("read method : "+ pd.getReadMethod());
            System.out.println("write method : "+ pd.getWriteMethod());
            System.out.println("-------------------");
        }

    }
}
