package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list =  new ArrayList<>();



        System.out.printf("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Emplyoee # "+ i);
            System.out.printf("ID : ");
            Integer id = sc.nextInt();
            while (hasId(list, id)){
                System.out.println("Id already taken! Try again!");
                System.out.printf("ID: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Salary: ");
            Double salary = sc.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.println();
        System.out.printf("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        //Integer pos = position(list, id);
        Employee emp = list.stream().filter(x ->x.getId()==id).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.printf("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        for (Employee obj:
             list) {
            System.out.println(obj);
        }














    sc.close();
    }
    public static int position(List<Employee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public static boolean hasId (List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() ==id).findFirst().orElse(null);
        return emp!= null;
    }
}
