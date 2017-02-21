package abstractClasses;

/**
 * Created by m.losK on 2017-02-21.
 */
public class Student extends Person {
    private String specialization;

    public Student(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    @Override
    public String getDestricption() {
        return "student specialization: " + specialization;
    }
}
