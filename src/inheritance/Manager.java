package inheritance;

/**
 * Created by m.losK on 2017-02-17.
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * @param name imie i nazwisko pracownika
     */

    public Manager(String name, double salary, int day, int month, int year) {
        super(name, salary, day, month, year);
        this.bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;

    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
