package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        //sum numbers as long as positive number is provided

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = scan.nextInt();

        int sum = 0;
        while (n >= 0){
            sum += n;
            System.out.println("enter a number:");
            n = scan.nextInt();
        }
        System.out.println("sum = " + sum);

    }
}
