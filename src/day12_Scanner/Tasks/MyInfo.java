package day12_Scanner.Tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age:");
        int age = scan.nextInt();

        System.out.println("enter your gender:");
        String gender = scan.next();

        System.out.println("enter your full name:");
        scan.nextLine();
        String fullName = scan.nextLine();

        System.out.println("enter your phone number:");
        long phoneNumber = scan.nextLong();

        System.out.println("enter your zip code:");
        int zipCode = scan.nextInt();

        System.out.println("enter your school name:");
        scan.nextLine();
        String schoolName = scan.nextLine();

        System.out.println("enter your city name:");
        String cityName = scan.nextLine();

        System.out.println("enter your state name:");
        String stateName = scan.next();

        System.out.println("enter your building number:");
        int buildingNumber = scan.nextInt();

        System.out.println("enter your street name");
        scan.nextLine();
        String streetName = scan.nextLine();

        String address = "\n\t\t\t"+buildingNumber + " " +streetName + "\n\t\t\t" + cityName +", " + stateName + " " + zipCode;

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("address = " + address);
        System.out.println("schoolName = " + schoolName);
    }
}
