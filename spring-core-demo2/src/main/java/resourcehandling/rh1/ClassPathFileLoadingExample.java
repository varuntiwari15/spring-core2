package resourcehandling.rh1;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.nio.file.Files;

public class ClassPathFileLoadingExample {
    public static void main(String[] args) throws IOException {
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:test123.txt");  // from classpath
        Resource resource2 = resourceLoader.getResource("file:E:\\test-folder\\demo\\test12345.txt");  // from local directry
        Resource resource3 = resourceLoader.getResource("url:http://www.test.com"); //load a web resource
        byte[] bytes = Files.readAllBytes(resource.getFile().toPath());
        String fileContent = new String(bytes);
        System.out.println(fileContent);
        System.out.println("**********from local directory*************");
        byte[] bytes1 = Files.readAllBytes(resource2.getFile().toPath());
        String fileContent2 = new String(bytes1);
        System.out.println(fileContent2);
        //output
        //hello to spring core tuto,
        //currently we are discussing ResourceLoader
        //and Resource interface
        //
        //**********from local directory*************
        //hello to spring core tuto,
        //currently we are discussing ResourceLoader
        //and Resource interface
        //this file exist in local directory
    }
}
