package app;

import entities.LegalEstity;
import entities.Person;
import entities.PrivateIndividual;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numTaxPayers = sc.nextInt();

        for (int i = 0; i < numTaxPayers; i++){
            System.out.println("Tax payer #" + (1+i) + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new PrivateIndividual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                list.add(new LegalEstity(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        double sum = 0.0;
        for (Person payer:
             list) {
            sum += payer.taxesPaid();
            System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.taxesPaid()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum) );





        sc.close();
    }
}
