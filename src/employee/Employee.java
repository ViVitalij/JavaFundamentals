package employee;

import java.time.LocalDate;

/**
 * Created by m.losK on 2017-02-17.
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
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary += raise;
    }

    @Override
    public String toString() {
        return  name +
                ", salary: " + salary +
                ", hireDay: " + hireDay;
    }
}
