package propertyeditors.pe2;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomEditor extends PropertyEditorSupport {

    private final DateTimeFormatter formatter;

    public CustomEditor(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public String getAsText() {
        return getValue().toString();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(LocalDate.parse(text, formatter));
    }

}
