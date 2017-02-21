package abstractClasses;

/**Demonstrates abstract classes
 * Created by m.losK on 2017-02-21.
 * based on Cay Horstmann's code
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        people[0] = new Employee("Mateusz Loska",10000, 10, 2, 2016);
        people[1] = new Employee("Anna Loska",9000, 11, 1, 2017);
        people[2] = new Student("Piotr Cienkowski", "double bass player");
        people[3] = new Student("Pawel Stepniak", "lawyer");

        for (Person person: people) {
            System.out.println(person.getName() + ", " + person.getDestricption());
        }
    }
}
