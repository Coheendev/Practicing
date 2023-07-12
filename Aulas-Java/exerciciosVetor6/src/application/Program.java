package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);


        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        int[] primeiroVetor = new int[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < primeiroVetor.length; i++) {
            primeiroVetor[i] = sc.nextInt();
        }

        int[] segundoVetor = new int[n];
        System.out.println("Digite os valores do vetor B");
        for (int i = 0; i < segundoVetor.length; i++) {
            segundoVetor[i] = sc.nextInt();
        }

        int[] somaVetor = new int[n];
        for (int i = 0; i < somaVetor.length; i++){
            somaVetor[i] = primeiroVetor[i] + segundoVetor[i];
            System.out.println(somaVetor[i]);
        }





        sc.close();
    }
}
