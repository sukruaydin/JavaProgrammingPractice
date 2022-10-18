package day14_String2.Tasks;

import java.util.Scanner;

public class CalculateTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while(true){
            System.out.println("enter first number:");
            int n1 = scan.nextInt();
            System.out.println("enter second number:");
            int n2 = scan.nextInt();
            System.out.println("enter math operator:");
            char c = scan.next().charAt(0);

            while(!(c == '+' || c == '-' || c == '*' || c == '/')){
                System.err.println("invalid operator given, please re-enter");
                System.out.println("enter math operator:");
                c = scan.next().charAt(0);
            }

            result = (c == '+')? n1+n2 :(c == '-')? n1-n2 :(c == '*')? n1*n2 : n1/n2;
            System.out.println("result = " + result);

            System.out.println("do you want to continue? yes/no");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer given, please re-enter");
                System.out.println("do you want to continue? yes/no");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }



    }
}
