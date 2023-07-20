package beansmanipulation.bm5;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class NestedBeanTest {
    public static void main(String[] args) {
        BeanWrapper beanWrapperUser = new BeanWrapperImpl(new User());
        beanWrapperUser.setPropertyValue("name", "Varun Tiwari");
        BeanWrapper beanWrapperAddress = new BeanWrapperImpl(new Address());
        beanWrapperAddress.setPropertyValue("addressCode", 3004);
        beanWrapperAddress.setPropertyValue("addressCity", "FRISCO");
        beanWrapperUser.setPropertyValue("address", beanWrapperAddress.getWrappedInstance());
        System.out.println(beanWrapperUser.getWrappedInstance());
        System.out.println("*****setting nested bean with nested path********");
        BeanWrapper beanWrapperUser2 = new BeanWrapperImpl(new User());
        beanWrapperUser2.setPropertyValue("name", "test-name");
        beanWrapperUser2.setPropertyValue("address", new Address());
        beanWrapperUser2.setPropertyValue("address.addressCode", 4567);
        beanWrapperUser2.setPropertyValue("address.addressCity", "test-city");
        System.out.println(beanWrapperUser2.getWrappedInstance());
        // Setting nested collection elements via index
       // public class EmployeeGroup {
       //     private String groupName;
       //     private List<Employee> employeeList;
       //     private Map<String, String> groupProperties;
      //  BeanWrapperImpl bw = new BeanWrapperImpl(new EmployeeGroup());
      //  bw.setPropertyValue("groupName", "TennisTeam");
      //  bw.setPropertyValue("employeeList", new ArrayList<>());
//        bw.setPropertyValue("employeeList[0]", new Employee());
//        bw.setPropertyValue("employeeList[0].name", "Mike");
//        bw.setPropertyValue("employeeList[0].department", new Department());
//        bw.setPropertyValue("employeeList[0].department.deptCode", 1001);
//        bw.setPropertyValue("employeeList[0].department.deptName", "Admin");
//        bw.setPropertyValue("employeeList[1]", new Employee());
//        bw.setPropertyValue("employeeList[1].name", "Jackie");
//        bw.setPropertyValue("employeeList[1].department", new Department());
//        bw.setPropertyValue("employeeList[1].department.deptCode", 1002);
//        bw.setPropertyValue("employeeList[1].department.deptName", "Account");
//        bw.setPropertyValue("groupProperties", new HashMap<>());
//        bw.setPropertyValue("groupProperties[location]", "Texas");
//        bw.setPropertyValue("groupProperties[matchesPerYear]", "2");

    }
}
