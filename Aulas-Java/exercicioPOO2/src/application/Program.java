package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =new Scanner(System.in);
        Employee emplo = new Employee();

        System.out.print("Name: ");
        emplo.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        emplo.salary = sc.nextDouble();
        System.out.print("Tax: ");
        emplo.tax = sc.nextDouble();
        System.out.println();

        System.out.print("Employee: " + emplo);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emplo.increseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + emplo);



    }
}
