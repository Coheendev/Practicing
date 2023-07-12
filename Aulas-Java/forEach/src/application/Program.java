package application;

public class Program {
    public static void main(String[] args) {


        String[] vect = new String[]{"Maria", "Bob", "Alex"};

        Integer[] numeral = new Integer[]{0, 1, 2, 3, 4, 5};

        for(int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("------------------------------");
        for(String paraCadaObjeto : vect){
            System.out.println(paraCadaObjeto);
        }

        System.out.println("------------------------------");

        for(Integer paraCadaObjeto : numeral){
            System.out.println(paraCadaObjeto);
        }






    }
}
