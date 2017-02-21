package abstractClasses;

/**
 * Created by m.losK on 2017-02-21.
 */
public abstract class Person {
    public abstract String getDestricption();

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
