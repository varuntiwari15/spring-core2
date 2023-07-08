package com.test.example.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestClientScope {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigScope.class);
        College college = context.getBean(College.class);
        Department deptMaths = context.getBean(Department.class);
        Department deptPhysics = context.getBean(Department.class);
        Student student1 = context.getBean(Student.class);
        student1.setDepartment(deptMaths);
        Student student2 = context.getBean(Student.class);
        student2.setDepartment(deptPhysics);
        college.setName("MIET, Meerut");
        deptMaths.setName("Maths Dept.");
        deptMaths.printDepartment();
        deptPhysics.setName("Physics Dept.");
        deptPhysics.printDepartment();
        student1.setName("Varun Tiwari");
        student2.setName("Ravi Pandey");
        student1.printDetails();
        student2.printDetails();
        //output
       // Student name is : Ravi Pandey code : 129153987 and his dept is : Physics Dept. code : 168907708 and college name is : MIET, Meerut code : 447718425
       // Student name is : Ravi Pandey code : 129153987 and his dept is : Physics Dept. code : 168907708 and college name is : MIET, Meerut code : 447718425
       // as all beans have scope singleton as default so we got above output
       // not modified Department and student bean as prototype and keep college bean as singleton
        // after setting scopes properly output as
      //  dept name :Maths Dept. code : 129153987 , college name : MIET, Meerut code : 168907708
      //  dept name :Physics Dept. code : 447718425 , college name : MIET, Meerut code : 168907708
      //  Student name is : Varun Tiwari code : 1206569586 and his dept is : Maths Dept. code : 129153987 and college name is : MIET, Meerut code : 168907708
      //  Student name is : Ravi Pandey code : 1427381743 and his dept is : Physics Dept. code : 447718425 and college name is : MIET, Meerut code : 168907708

    }
}
