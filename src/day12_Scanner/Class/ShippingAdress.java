package day12_Scanner.Class;

import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name : ");
        String fullName = scan.nextLine();

        System.out.println("enter your building number : ");
        String building = scan.next();

        System.out.println("enter your street name : ");
        scan.nextLine();
        String streetName = scan.nextLine();

        System.out.println("enter your city name :");
        String cityName = scan.nextLine();

        System.out.println("enter your state name : ");
        String stateName = scan.next();

        System.out.println("enter your zipCode : ");
        int zipCode = scan.nextInt();

        System.out.println("enter your country name :");
        scan.nextLine();
        String countryName = scan.nextLine();


        System.out.println(fullName);
        System.out.println(building + " " + streetName);
        System.out.println(cityName + " " + stateName + " " + zipCode);
        System.out.println(countryName);

        scan.close();
    }
}
