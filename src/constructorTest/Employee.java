package constructorTest;

import java.util.Random;

/**
 * Created by m.losK on 2017-02-17.
 */
public class Employee {
    private static int nextId;

    private int id;
    private String name = "";    //Instance field initialization.
    private double salary;

    //Static initialization block.
    static {
        Random generator = new Random();
        //Set nextId to a random number between 10 and 100.
        nextId = generator.nextInt(91) + 10;
    }

    //Object initialization block.
    {
        id = nextId;
        nextId++;
    }

    //Three overloaded constructors.
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {

        //Calls the Employee(String, double) constructor.
        this("Employee #" + nextId, salary);
    }

    //The default constructor.
    public Employee() {
        //Name initialized to ""--see above.
        //Salary not explicitly set--initialized to 0.
        //Id initialized in initialization block.
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
