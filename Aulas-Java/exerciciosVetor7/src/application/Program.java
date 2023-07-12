package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();
        String[] pessoa = new String[n];
        int[] idade = new int[n];

        for (int i = 0; i < pessoa.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            pessoa[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }
        int maioridade = idade[0];
        int posicaomaior = 0;


        for (int i=1; i<n; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }

        System.out.println("Pessoa mais velha " + pessoa[posicaomaior]);
















        sc.close();
    }
}
