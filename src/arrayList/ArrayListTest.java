package arrayList;

import employeeTest.Employee;

import java.util.ArrayList;

/**
 * Demonstrates ArrayList class
 * Created by m.losK on 2017-02-22.
 * based on Cay Horstmann's code
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Mateusz Loska", 10000, 10, 1, 2017));
        staff.add(new Employee("Anna Loska", 8000, 1, 12, 2016));
        staff.add(new Employee("Piotr Cienkowski", 4000, 11, 3, 2016));

        for (Employee employee : staff) {
            employee.raiseSalary(7);
        }

        for (Employee employee : staff) {
            System.out.println(employee.getName() + ", salary: " + employee.getSalary()
                    + ". Employed: " + employee.getHireDay());
        }
    }
}
