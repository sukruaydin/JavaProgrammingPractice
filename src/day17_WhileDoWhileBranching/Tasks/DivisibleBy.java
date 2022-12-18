package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("provide a number:");
        int n = scan.nextInt();

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";
        for (int i = 1; i <= n; i++){
            if(i % 15 == 0){
                divisibleBy15 += i+" ";
            } else if (i % 3 == 0) {
                divisibleBy3 += i+" ";
            } else if (i % 5 == 0) {
                divisibleBy5 += i+" ";
            }
        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
    }
}
