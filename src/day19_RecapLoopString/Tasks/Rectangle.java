package day19_RecapLoopString.Tasks;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter the length of the Rectangle:");
            double l = scan.nextDouble();
            if (l <= 0.0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the width of the Rectangle:");
            double w = scan.nextDouble();
            if (w <= 0.0){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(0);
            }

            double area = l * w;
            double perimeter = 2 * l * w;
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("invalid answer given, please re-enter");
                System.out.println("Would you like to calculate another Rectangle?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }
        }

    }
}
