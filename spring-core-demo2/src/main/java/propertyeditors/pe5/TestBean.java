package propertyeditors.pe5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class TestBean {

    @Value("${theTradeDate}")
    private Date tradeDate;

    public void showDetails(){
        System.out.println("trade date : "+ tradeDate);
    }

}
