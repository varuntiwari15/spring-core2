package propertyeditors.pe2;

import org.springframework.beans.BeanWrapperImpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomEditorTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        BeanWrapperImpl wrapper = new BeanWrapperImpl(p1);
        wrapper.registerCustomEditor(LocalDate.class, new CustomEditor(DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        wrapper.setPropertyValue("name", "Tom");
        wrapper.setPropertyValue("dateOfBirth", "1980/06/15");
        System.out.println(p1);
    }
}
