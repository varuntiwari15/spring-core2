package propertyeditors.pe4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Currency;

@Component
public class TestBean {
    @Value("${theCurrency}")
    private Currency currency;

    public void showDetails(){
        System.out.println("currency from prop file : "+ currency);
        System.out.println("the currency name is : "+ currency.getDisplayName());
    }
}
