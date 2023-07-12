package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char res = sc.next().charAt(0);
        if (res == 'y'){
            System.out.print("Enter initial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            account = new Account(acc, holder, inicialDeposit);

        }else {
             account = new Account(acc, holder);

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);



        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated data: ");
        System.out.println(account);


        sc.close();
    }
}
