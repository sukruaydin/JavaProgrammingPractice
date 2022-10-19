package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("enter a word");
        String s1 = new Scanner(System.in).nextLine();

        String s2 = "";
        for (int i = s1. length()-1; i >= 0; i--){
            s2 += ""+ s1.charAt(i);
        }
        boolean result = s1.equalsIgnoreCase(s2);
        System.out.println("result = " + result);
    }

}
