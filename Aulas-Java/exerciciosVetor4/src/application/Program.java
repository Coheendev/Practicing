package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        System.out.print("Digite a quantidade de numeros: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero:");
            vetor[i]= sc.nextInt();
        }

        System.out.print("Numeros Pares: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i]%2==0){
                soma ++;
                System.out.print(" "+ vetor[i]);
            }
        }
        System.out.println();
        System.out.print("Quantidade de numeros pares: "+ soma);







        sc.close();
    }
}
