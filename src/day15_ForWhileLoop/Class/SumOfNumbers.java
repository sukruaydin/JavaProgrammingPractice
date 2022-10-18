package day15_ForWhileLoop.Class;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        //find the sum of numbers between 1~100
        double sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
        System.out.println("--------------------------------");

        //print the sum of given 5 value from user
        Scanner scan = new Scanner(System.in);
        int total = 0;
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("enter a number:");
            int n = scan.nextInt();
            total += n;
        }
        System.out.println("total = " + total);
        scan.close();

    }
}
