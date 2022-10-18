package day15_ForWhileLoop.Class;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //write a program that asks the user to enter a number for 5 times
        //find the max number out of them
        Scanner scan = new Scanner(System.in);
        int max = -2_147_483_648; //min integer number

        for (int i = 1; i <= 5; i++) {
            System.out.println("enter number " + i);
            int n = scan.nextInt();

            if(n > max){
                max = n;
            }
        }
        System.out.println("max = " + max);
    }
}
