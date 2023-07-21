package propertyeditors.pe1;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversionCustomBeanWrapperTest {
    public static void main(String[] args) {
        User user = new User();
        BeanWrapper wrapper = new BeanWrapperImpl(user);
        CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
        wrapper.registerCustomEditor(Date.class, editor);
        wrapper.setPropertyValue("name", "demo");
        wrapper.setPropertyValue("dateOfBirth", "1991-03-11");
        System.out.println(user);
    }
}
