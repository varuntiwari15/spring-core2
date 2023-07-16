package evnprofiles.env5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookBean {
    @Value("${book.name}")
    private String bookName;
    @Value("${book.price}")
    private String bookPrice;
    @Value("${book.country: India}")
    private String bookCountry;

    public void printdetails(){
        System.out.println("Book name : "+ bookName+" , Book price : "+ bookPrice+" , Book country : "+bookCountry);
    }
}
