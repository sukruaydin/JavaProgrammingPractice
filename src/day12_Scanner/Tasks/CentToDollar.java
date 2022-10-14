package day12_Scanner.Tasks;

import java.util.Scanner;

public class CentToDollar {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter the amount of cents : ");
        int cents = scan.nextInt();

        int dollar = cents / 100;
        double remainingCent = cents % 100;
        System.out.println(cents + " equals to : " + dollar + " dollars and " + remainingCent + " cents ");

    }
}
