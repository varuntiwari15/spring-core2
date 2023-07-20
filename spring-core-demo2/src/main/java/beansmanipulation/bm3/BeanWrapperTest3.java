package beansmanipulation.bm3;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;

import java.util.HashMap;
import java.util.Map;

public class BeanWrapperTest3 {
    public static void main(String[] args) {
        BeanWrapper beanWrapper = new BeanWrapperImpl(new User());
        Map<String, Object> map = new HashMap<>();
        map.put("name", "test2");
        map.put("age", 27);
        beanWrapper.setPropertyValues(map);
        System.out.println(beanWrapper.getWrappedInstance());
        System.out.println("********************");
        BeanWrapper beanWrapper2 = new BeanWrapperImpl(new User());
        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.add("name", "test3");
        mutablePropertyValues.add("age", 26);
        beanWrapper2.setPropertyValues(mutablePropertyValues);
        System.out.println(beanWrapper2.getWrappedInstance());

    }
}
