package constructorTest;

/**
 * Created by m.losK on 2017-02-17.
 */
public class ConstructorTest {
    public static void main(String[] args) {

        //Fill the staff array with Employee objects.
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Mateusz Loska", 10000);
        staff[1] = new Employee(6000);
        staff[2] = new Employee();

        //Print out information about all Employee objects.
        for (Employee e : staff) {
            System.out.println(e.getName() + ", id#" + e.getId() + ", " + e.getSalary());
        }
    }
}
