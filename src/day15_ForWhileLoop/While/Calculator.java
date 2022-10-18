package day15_ForWhileLoop.While;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int n1 = scan.nextInt();
        System.out.println("enter second number:");
        int n2 = scan.nextInt();
        System.out.println("enter a math operator:"); // + , - only
        char c = scan.next().charAt(0);

        while (!(c == '+' || c == '-')){
            System.err.println("invalid operator, please re-enter");
            c = scan.next().charAt(0);
        }

        int result = (c == '+') ? n1+n2 : n1-n2;
        System.out.println("result = " + result);
    }
}
