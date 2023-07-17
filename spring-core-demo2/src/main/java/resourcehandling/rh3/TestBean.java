package resourcehandling.rh3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Component
public class TestBean {
    @Value("classpath:test123.txt")
    private Resource resource;
    @PostConstruct
    public void init() throws IOException {
        File file = resource.getFile();
        byte[] bytes = Files.readAllBytes(file.toPath());
        String result = new String(bytes);
        System.out.println(result);
    }
}
