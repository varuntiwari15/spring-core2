package propertyeditors.pe3;

import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyEditor;
import java.util.Currency;
import java.util.Date;

public class AccessDefaultPropertyEditorTest {
    public static void main(String[] args) {
        BeanWrapperImpl wrapper = new BeanWrapperImpl();
        PropertyEditor defaultEditor1 = wrapper.getDefaultEditor(Currency.class);
        defaultEditor1.setAsText("USD");
        Currency value = (Currency)defaultEditor1.getValue();
        System.out.println(value.getDisplayName());
        defaultEditor1.setAsText("INR");
        Currency value2 = (Currency)defaultEditor1.getValue();
        System.out.println(value2.getDisplayName());
//        PropertyEditor editor2 = wrapper.getDefaultEditor();
//        editor2.setAsText("2022/03/23");
//        Object value1 = editor2.getValue();
//        System.out.println(value1);
    }
}
