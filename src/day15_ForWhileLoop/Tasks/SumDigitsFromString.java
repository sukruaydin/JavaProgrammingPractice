package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class SumDigitsFromString {

    public static void main(String[] args) {
        //IMPORTANT ---> converting char to int value
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        int sumOfNumbers = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                sumOfNumbers += s.charAt(i)-'0';
            }
        }
        System.out.println("sumOfNumbers = " + sumOfNumbers);
    }
}
