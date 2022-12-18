package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class MathOperator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number1:");
        int n1 = scan.nextInt();
        System.out.println("enter number2:");
        int n2 = scan.nextInt();
        System.out.println("enter math operator:");
        char c = scan.next().charAt(0);

        while (!(c == '+' || c == '-' || c == '*' || c == '/')){
            System.out.println("invalid operator, please re-enter:");
            System.out.println("enter math operator:");
            c = scan.next().charAt(0);
        }

        int result = (c == '+')? n1+n2 :(c == '-')? n1-n2:(c == '*')? n1*n2: n1/n2;
        System.out.println("result = " + result);
    }
}
