package Listjava;

public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    public double calculateSalary() {
        return this.getSalary();
    }

    public String toString() {
        return "Devloper { Name :  " + this.getName() + " salary:" + this.calculateSalary() + "$ }";
    }

}
