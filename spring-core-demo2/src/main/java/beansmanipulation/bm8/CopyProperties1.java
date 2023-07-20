package beansmanipulation.bm8;

import org.springframework.beans.BeanUtils;

public class CopyProperties1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Marker");
        p1.setAge(29);
        Employee e1 = new Employee();
        BeanUtils.copyProperties(p1, e1);
        System.out.println(e1);  // extra field of target will be ignored
        //output-Employee{name='Marker', age=29, dept='null'}
        System.out.println("***********reverse*********");
        Employee e2 = new Employee();
        e2.setName("Parcel");
        e2.setAge(33);
        e2.setDept("Maths");
        Person p2 = new Person();
        BeanUtils.copyProperties(e2, p2);
        System.out.println(p2);
        //output-Person{name='Parcel', age=33}
        System.out.println("**********ignore some property***********");
        Person p3 = new Person();
        p3.setName("Volvo");
        p3.setAge(32);
        Employee e3 = new Employee();
        BeanUtils.copyProperties(p3, e3, "age");
        System.out.println(e3);
        //output-Employee{name='Volvo', age=null, dept='null'}
        System.out.println("*****copying only some fields*****");
        //Using copyProperties(Object source, Object target, Class<?> editable)
        //This method copies the property values of the given source bean into the given target
        // bean, only setting properties defined in the given "editable" class (or interface).
        //The source and target classes do not have to match or even be derived from each other,
        // as long as the properties match.
        //The target object must be an instance of editable class/interface.
    }
}
