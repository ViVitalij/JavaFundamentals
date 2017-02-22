package equals;

/**
 * Created by m.losK on 2017-02-21.
 */
public class Manager extends Employee {
    private double bonus;


    public Manager(String name, double salary, int day, int month, int year) {
        super(name, salary, day, month, year);
        this.bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        //super.equals method checked that this. and other. belong to the same class
        return this.bonus == other.bonus;
    }

    public int hashCode() {
        return super.hashCode() + 17 * new Double(this.bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + " [bonus=" + bonus + "]";
    }
}
