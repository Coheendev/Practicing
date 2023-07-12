import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*   Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if ( i %2 == 1){
                System.out.println(i);
            }

        }*/


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int in = 0;
        int out = 0;


        for (int i = 0; i < n ; i++){
            int num = sc.nextInt();
            if (num >=10 && num<=20){
                in ++;
            }else {
                out ++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N ; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2 + b * 3 + c * 5) / 10;


            System.out.printf("%.1f%n", media);

        }

        sc.close();
    }

}