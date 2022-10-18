package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class SumOfGivenNumber {

    public static void main(String[] args) {

        System.out.println("enter a number:");
        int n = new Scanner(System.in).nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
