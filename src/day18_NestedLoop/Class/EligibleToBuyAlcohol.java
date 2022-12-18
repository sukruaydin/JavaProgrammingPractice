package day18_NestedLoop.Class;

import java.util.Scanner;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("enter your age:");
            int age = scan.nextInt();

            while (!(age > 18 && age < 120)){
                System.out.println("invalid age given, please re-enter");
                System.out.println("enter your age:");
                age = scan.nextInt();
            }

            System.out.println("would you like to continue?");
            scan.nextLine();
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("invalid answer given, please re-enter");
                System.out.println("would you like to continue?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }
        }

    }
}
