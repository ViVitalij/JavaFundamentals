package interfaces;

/**
 * Created by m.losK on 2017-03-06.
 */
public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return Double.compare(this.salary, otherEmployee.salary);
    }
}
