package com.test.example.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  // 2nd run
public class Student {

    private String name;

    @Autowired
    private College college;

    @Autowired
    private Department department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printDetails(){
        System.out.println("Student name is : "+ this.getName()+ " code : "+ System.identityHashCode(this)+
                " and his dept is : "+ department.getName() + " code : "+ System.identityHashCode(department)
        + " and college name is : "+ college.getName() + " code : "+ System.identityHashCode(college));
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college=" + college +
                ", department=" + department +
                '}';
    }
}
