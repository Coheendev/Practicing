package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        Double[] vetor = new Double[n];

        for (int i = 0; i < vetor.length; i++){
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        System.out.print("Todos os numeros: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " +vetor[i]);
        }

        System.out.println();
        double sum = 0;
        for (int i = 0; i < vetor.length; i++){
            sum += vetor[i];
        }
        double avg = sum / n;
        System.out.printf("Soma: %.2f%n", sum);
        System.out.printf("Media: %.2f%n", avg);






        sc.close();
    }
}

