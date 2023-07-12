package entities;

public class Employee {
    public String name;
    public double salary;
    public double tax;

    public double netSalary( ) {
        return salary - tax;
    }

    public void increseSalary(double porcentage) {
        porcentage /= 100;
        salary += salary * porcentage;

    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f",netSalary());
    }
}
