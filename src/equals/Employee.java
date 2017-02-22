package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by m.losK on 2017-02-21.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public boolean equals(Object otherObject) {
        //a quick test to see if the objects are identical
        if (this == otherObject) return true;

        //must return false if the explicit parameter is null
        if (otherObject == null) return false;

        //if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) return false;

        //now we know that otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        //test whether the fields have identical values
        return Objects.equals(this.name, other.name) && this.salary == other.salary && Objects.equals(this.hireDay, other.hireDay);
    }

    public int hashCode() {
        return Objects.hash(this.name, this.salary, this.hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + " " + name +
                ", salary=" + this.salary +
                ", hireDay=" + this.hireDay;
    }
}
