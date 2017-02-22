package employeeTest;

import java.time.LocalDate;

/**
 * Created by m.losK on 2017-02-17.
 */
public class Employee {

    private static int nextId = 1;

    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
        this.id=0;
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

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent/100;
        this.salary += raise;
    }

    @Override
    public String toString() {
        return  "Id " + this.id + " " + this.name +
                ", salary: " + this.salary +
                ", hireDay: " + this.hireDay;
    }

    /**
     *  unit test
     */
    public static void main(String[] args) {
        Employee e = new Employee("Mateusz", 10000, 10,10,1986);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}
