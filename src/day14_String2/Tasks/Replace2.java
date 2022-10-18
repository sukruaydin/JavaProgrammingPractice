package day14_String2.Tasks;

import java.util.Scanner;

public class Replace2 {

    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String w = scan.next();

        w = w.replace("x", "a").replace("X","a");
        System.out.println("w = " + w);

    }
}
