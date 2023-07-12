package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        int posicao = 0;

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i= 0; i < vetor.length; i++){
            System.out.print("Digite o numero: ");
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0 ; i < vetor.length; i++){
            if (vetor[i] >= maior) {
                maior = vetor[i];
               posicao = i;
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Posição do maior valor = " + posicao);









        sc.close();
    }
}
