package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class ReverseString2 {

    public static void main(String[] args) {

        System.out.println("enter a string:");
        String s1 = new Scanner(System.in).nextLine();

        String s2 = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            s2 += "" + s1.charAt(i);
        }
        System.out.println("s2 = " + s2);
    }
}
