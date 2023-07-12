package application;

import util.CurrencyConvert;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        CurrencyConvert.dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?");
        CurrencyConvert.bought = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConvert.convert());
    }
}
