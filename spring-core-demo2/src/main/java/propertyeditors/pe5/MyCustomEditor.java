package propertyeditors.pe5;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class MyCustomEditor implements PropertyEditorRegistrar {
    @Override
    public void registerCustomEditors(PropertyEditorRegistry registry) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setLenient(false);
        registry.registerCustomEditor(Date.class, new CustomDateEditor(simpleDateFormat, true));
    }
}
