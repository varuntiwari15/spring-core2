package beansmanipulation.bm7;

import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;

public class BeanUtilsTest {
    public static void main(String[] args) {
        PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(User.class);
        for(PropertyDescriptor pd : propertyDescriptors){
            System.out.println("name : "+pd.getName());
            System.out.println("property type : "+ pd.getPropertyType());
            System.out.println("read method : "+ pd.getReadMethod());
            System.out.println("write method : "+ pd.getWriteMethod());
            System.out.println("-------------------");
        }

    }
}
