package employeeTest;

/**
 * Created by m.losK on 2017-02-17.
 * based on Cay Horstmann's code
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];

        staff[0] = new Employee("Mateusz Loska", 10000, 17, 2, 2016);
        staff[1] = new Employee("Anna Loska", 8000, 1, 3, 2016);
        staff[2] = new Employee("Piotr Cienkowski", 4000, 12, 6, 2016);
        staff[3] = new Employee("Pawel Stepniak", 4500, 12, 9, 2016);

        for (Employee e : staff) {
            e.raiseSalary(5);
        }
        for (Employee e : staff) {
            e.setId();
            System.out.println("After salary raise: " + e.toString());
        }

        int nextAvailableId = Employee.getNextId();     //proper call a static method (instead of e.g. staff[0].getNextId();
        System.out.println("Next available identifier is " + nextAvailableId);
    }
}
