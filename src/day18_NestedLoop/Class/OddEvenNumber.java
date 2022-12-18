package day18_NestedLoop.Class;

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        //verify the given number odd or even
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter a number:");
            int n = scan.nextInt();

            if (n % 2 == 0){
                System.out.println("even number");
            }else {
                System.out.println("odd number");
            }

            System.out.println("would you like to enter another number?");
            scan.nextLine();
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("invalid answer given, please re-enter");
                System.out.println("would you like to enter another number?");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }
        }

    }
}
