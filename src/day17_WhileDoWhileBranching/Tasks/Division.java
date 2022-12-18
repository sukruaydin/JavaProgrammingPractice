package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        //suppose that n1 > n2, and positive numbers
        //not allowed to use *, /, % operators
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number1:");
        int n1 = scan.nextInt();
        System.out.println("enter number2:");
        int n2 = scan.nextInt();

        int result = 0;
        while (n1 >= n2){
            n1 -= n2;
            result++;
        }
        System.out.println("result = " + result + " with the remainder of " + n1);
    }
}
