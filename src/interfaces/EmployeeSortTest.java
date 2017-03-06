package interfaces;

import java.util.Arrays;

/**
 * Demonstration of using the Comparable interface
 * Created by m.losK on 2017-03-06.
 * based on Cay Horstmann's code
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[4];

        staff[0] = new Employee("Mateusz Loska", 13000);
        staff[1] = new Employee("Anna Loska", 8000);
        staff[2] = new Employee("Piotr Cienkowski", 4000);
        staff[3] = new Employee("Pawel Stepniak", 5000);

        Arrays.sort(staff);

        for (Employee employee :
                staff) {
            System.out.println(employee.getName() + ", salary: " + employee.getSalary());
        }
    }
}
