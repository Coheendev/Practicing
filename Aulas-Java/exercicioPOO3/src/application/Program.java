package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("Name: ");
        stu.name = sc.nextLine();
        System.out.print("First note: ");
        stu.nota1 = sc.nextDouble();
        System.out.print("Second note: ");
        stu.nota2 = sc.nextDouble();
        System.out.print("Thirth note: ");
        stu.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", stu.finalNote());

        if (stu.finalNote() < 60.0){
            System.out.println("Failed");
            System.out.printf("MISSING %.2f POINTS%n", stu.missingPoints());
        }else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
