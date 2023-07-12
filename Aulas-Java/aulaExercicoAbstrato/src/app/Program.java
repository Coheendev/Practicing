package app;

import entities.Circle;
import entities.Enums.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Shape> listShape = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int numShape = sc.nextInt();
        for (int i = 0; i <numShape; i++){
            System.out.println("Shape #" + (1+i)+ " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r'){
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();
                listShape.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                listShape.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape:
             listShape) {
            System.out.println(String.format("%.2f", shape.area()));
        }









        sc.close();
    }
}
