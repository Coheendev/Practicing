package application;

import entitites.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        Pessoas[] vetor = new Pessoas[n];
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Pessoas(nome, idade, altura);
        }

        System.out.println();
        double sum = 0;
        for (int i = 0; i < vetor.length; i++){
            sum += vetor[i].getAltura();
        }
        double mediaAltura = sum / vetor.length;
        System.out.printf("Altura media: %.2f%n", mediaAltura);

        double nmenores = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i].getIdade() < 16) {
               nmenores++;
            }
        }

        double PorcentualMenores = (nmenores / vetor.length) *100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", PorcentualMenores);
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }


    sc.close();
    }
}
