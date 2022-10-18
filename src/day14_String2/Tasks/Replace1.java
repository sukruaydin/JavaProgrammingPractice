package day14_String2.Tasks;

import java.util.Scanner;

public class Replace1 {

    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String w = scan.next();

        if(w.startsWith("x")){
            w = w.replaceFirst("x", "a");
            System.out.println(w);
        }

    }
}
