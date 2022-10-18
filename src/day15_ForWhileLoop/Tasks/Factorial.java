package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("enter a number:");
        int n = new Scanner(System.in).nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        System.out.println("result = " + result);
    }

}
