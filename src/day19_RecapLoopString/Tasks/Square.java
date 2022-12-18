package day19_RecapLoopString.Tasks;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter the side of the square");
            double side = scan.nextDouble();
            if (side <= 0.0){
                System.err.println("Invalid entry for the side of the square");
                System.exit(0);
            }

            double area = side * side;
            double perimeter = 4 * side;
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another Square?");
            scan.nextLine();
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer given, please re-enter");
                System.out.println("Would you like to calculate another Square?");
                a = scan.nextLine().toLowerCase();
            }

            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }


    }
}
