package com.test.example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //2nd run
public class Department {
    private String name;
    @Autowired
    private College college;

    public void printDepartment(){
        System.out.println("dept name :"+ this.getName()+ " code : "+ System.identityHashCode(this)+
                            " , college name : "+ college.getName()+ " code : "+ System.identityHashCode(college));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", college=" + college +
                '}';
    }
}
