package evnprofiles.env4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StudentBean {
    @Autowired
    private Environment environment;

    @PostConstruct
    public void init(){
        System.out.println("Student year : "+ environment.getProperty("student.year"));
    }

}
