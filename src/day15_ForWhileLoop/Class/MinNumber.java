package day15_ForWhileLoop.Class;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        //write a program that asks the user to enter a number for 5 times
        //find the min number out of them
        Scanner scan = new Scanner(System.in);
        int min = 2_147_483_647; //max integer number

        for (int i = 1; i <= 5 ; i++) {
            System.out.println("enter number " + i);
            int n = scan.nextInt();

            if(n < min){
                min = n;
            }
        }
        System.out.println("min = " + min);
    }
}
