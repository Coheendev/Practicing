import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       /*
        System.out.print("Digite o numero de vezes que vc quer repitir o bloco (Valor de n): ");
        int n = sc.nextInt();
        int soma = 0;
        System.out.println("Valores que serão somados(Valor de num, dentro do bloco): ");


        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            soma += num;
        }

        System.out.println(soma);*/
        int x = 3;
        int y = 0;

        for (int i =0; i < 3; i++){
            System.out.print(i + ", ");
            y += 5;
            System.out.println(y);
        }
        sc.close();
    }
}