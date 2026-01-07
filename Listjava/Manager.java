package Listjava;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return this.getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public String toString() {
        return "Manager { Name :  " + this.getName() + " salary net:" + this.calculateSalary() + "$ }";
    }
}
