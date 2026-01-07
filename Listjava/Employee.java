package Listjava;

public abstract class Employee {

    private String Name;
    private double Salary;

    public Employee(String name, double salary) {
        this.Name = name;
        this.Salary = salary;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setSalary(double s) {
        this.Salary = s;
    }

    public double getSalary() {
        return this.Salary;
    }

    public String getName() {
        return this.Name;
    }

    public abstract double calculateSalary();

}
