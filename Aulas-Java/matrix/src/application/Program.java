package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho da matrix a ser feita: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++){
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        int coutNega = 0;
        for (int i =0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < 0){
                    coutNega++;
                }
            }
        }
        System.out.println("Negative numbers = " + coutNega);




        
        sc.close();
    }
}
