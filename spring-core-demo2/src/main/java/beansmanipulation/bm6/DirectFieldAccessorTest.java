package beansmanipulation.bm6;

import org.springframework.beans.DirectFieldAccessor;

public class DirectFieldAccessorTest {
    public static void main(String[] args) {
        DirectFieldAccessor accessor = new DirectFieldAccessor(new User());
        accessor.setPropertyValue("name", "test234");
        accessor.setPropertyValue("age", 24);
        Object wrappedInstance = accessor.getWrappedInstance();
        System.out.println(wrappedInstance);
        // nested beans
        //class PersonGroup {
        //    private String groupName;
        //    private List<Person> personList;
        //DirectFieldAccessor fieldAccessor = new DirectFieldAccessor(new PersonGroup());
        //        fieldAccessor.setPropertyValue("groupName", "BaseballTeam");
        //        fieldAccessor.setPropertyValue("personList", new ArrayList<>());
        //
        //        fieldAccessor.setPropertyValue("personList[0]", new Person());
        //        fieldAccessor.setPropertyValue("personList[0].name", "Mike");
        //        fieldAccessor.setPropertyValue("personList[0].age", 24);
        //
        //        fieldAccessor.setPropertyValue("personList[1]", new Person());
        //        fieldAccessor.setPropertyValue("personList[1].name", "Raj");
        //        fieldAccessor.setPropertyValue("personList[1].age", 26);
        //
        //        Object personGroup = fieldAccessor.getWrappedInstance();
        //***********
    }


}
