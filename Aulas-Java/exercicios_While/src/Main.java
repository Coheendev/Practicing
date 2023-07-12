import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner (System.in);
        int password = 2002;
        int num = sc.nextInt();

        while (num != password) {
            System.out.println("Senha Invalida");
            int tent = sc.nextInt();
            num = tent;
        };
        System.out.println("Acesso Permitido");
        sc.close();*/

        Scanner sc = new Scanner(System.in);
        int alcool =0;
        int gasolina = 0;
        int diesel = 0;
        int pedido = 0;
        int defaul = 0;

        while (pedido != 4){
            if (pedido == 1){
                alcool += 1;
            } else if (pedido == 2) {
                gasolina +=1;
            } else if (pedido == 3) {
                diesel += 1;
            };
            pedido = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        sc.close();

        for (int i = 0; i<)
    }
}