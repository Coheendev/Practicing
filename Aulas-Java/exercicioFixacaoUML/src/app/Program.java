package app;

import entities.Client;
import entities.Enum.OrderStatus;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        System.out.print("How many items to this order? ");
        int nOrders = sc.nextInt();
        Order order = new Order(new Date(),OrderStatus.valueOf(status), new Client(clientName, clientEmail, clientBirthDate));
        sc.nextLine();
        for (int i =0; i < nOrders; i++){
            System.out.println("Enter # " + (1+i) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }
        System.out.println(order);



    }
}
