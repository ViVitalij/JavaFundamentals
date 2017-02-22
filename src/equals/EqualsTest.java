package equals;

/**
 * Demonstrates the equals, hashCode and toString methods
 * Created by m.losK on 2017-02-21.
 * based on Cay Horstmann's code
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee mateusz1 = new Employee("Mateusz Loska", 10000, 9, 9, 2016);
        Employee mateusz2 = mateusz1;
        Employee mateusz3 = new Employee("Mateusz Loska", 10000, 9, 9, 2016);
        Employee anna = new Employee("Anna Loska", 9000, 10, 11, 2016);

        System.out.println("mateusz1 == mateusz2: " + (mateusz1 == mateusz2));
        System.out.println("mateusz1 == mateusz3: " + (mateusz1 == mateusz3) + " (should be true)");
        System.out.println("mateusz1.equals(mateusz3): " + mateusz1.equals(mateusz3));
        System.out.println("mateusz1.equals(anna): " + mateusz1.equals(anna));
        System.out.println("anna.toString(): " + anna.toString());

        Manager pawel = new Manager("Pawel Stepniak", 8000, 1, 1, 2017);
        Manager boss = new Manager("Pawel Stepniak", 8000, 1, 1, 2017);
        boss.setBonus(1000);

        System.out.println("boss.toString(): " + boss.toString());
        System.out.println("pawel.equals(boss): " + pawel.equals(boss));
        System.out.println("mateusz1.hashCode(): " + mateusz1.hashCode());
        System.out.println("mateusz3.hashCode(): " + mateusz3.hashCode());
        System.out.println("boss.hashCode(): " + boss.hashCode());
        System.out.println("pawel.hashCode(): " + pawel.hashCode());
    }
}
