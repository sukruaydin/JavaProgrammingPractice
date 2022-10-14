package day12_Scanner.Tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the product name :");
        String name = scan.nextLine();

        System.out.println("enter the price:");
        double price = scan.nextDouble();

        System.out.println("enter the quantity:");
        int quantity = scan.nextInt();

        System.out.println("enter your first name:");
        String fistName = scan.next();

        System.out.println(fistName + ", your order for " + quantity + " " + name + " has been placed. Your " +
                " total is : $" + (price * quantity));

    }
}
