package inheritance;

/**
 * Created by m.losK on 2017-02-17.
 * based on Cay Horstmann's code.
 */
public class ManagerTest {
    public static void main(String[] args) {

        Manager boss = new Manager("Mateusz Loska", 10000, 17, 2, 2016);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Piotr Cienkowski", 4000, 12, 6, 2016);
        staff[2] = new Employee("Pawel Stepniak", 4500, 12, 9, 2016);

        for (Employee e : staff) {
            System.out.println(e.getName() + ", salary: " + e.getSalary());
        }
    }
}
