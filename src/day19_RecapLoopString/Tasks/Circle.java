package day19_RecapLoopString.Tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("enter the radius");
            double r = scan.nextDouble();
            if (r <= 0.0){
                System.err.println("Invalid entry for the radius of the circle");
                System.exit(0);
            }

            double diameter = r * 2;
            double area = 3.14 * r * r;
            double perimeter = 2 * 3.14 * r;
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer, please re-enter");
                System.out.println("Would you like to calculate another circle?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }


    }
}
