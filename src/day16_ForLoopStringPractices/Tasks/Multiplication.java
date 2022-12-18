package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        //multiplication without using * operator
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a positive number:");
        int n1 = scan.nextInt();
        System.out.println("enter a positive number:");
        int n2 = scan.nextInt();

        int result = 0;
        if (n1 > 0 && n2 > 0) {
            for (int i = 1; i <= n2; i++) {
                result += n1;
            }
        }else {
            System.out.println("invalid");
        }
        System.out.println("result = " + result);
    }
}
