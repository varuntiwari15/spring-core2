package propertyeditors.pe1;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.time.LocalDateTime;

public class DateConversionAuto1 {
    public static void main(String[] args) {
        String dateString = LocalDateTime.now().toString();
        System.out.println("date in string : "+ "Mon Mar 11 00:00:00 CST 1991");
        User user = new User();
        BeanWrapper beanWrapper = new BeanWrapperImpl(user);
        beanWrapper.setPropertyValue("name", "Varun");
        beanWrapper.setPropertyValue("dateOfBirth", dateString);
        System.out.println(user);
    }
}
