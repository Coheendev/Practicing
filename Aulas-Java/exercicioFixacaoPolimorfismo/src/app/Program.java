package app;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numProducts = sc.nextInt();
        for (int i = 0; i < numProducts; i++){
            System.out.println("PRODUCT #" + (1+i) + " data:");
            System.out.print("Commom, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String productName = sc.nextLine();
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                listProduct.add(new ImportedProduct(productName, productPrice, customsFee));
            } else if ( ch == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuDate = sdf.parse(sc.next());
                listProduct.add(new UsedProduct(productName, productPrice, manuDate));
            } else {
                listProduct.add(new Product(productName, productPrice));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product pro : listProduct){
            System.out.println(pro.priceTag());
        }








        sc.close();
    }
}
