package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class ReverseAString {

    public static void main(String[] args) {

        System.out.println("enter a string");
        String s = new Scanner(System.in).nextLine();

        String s2 = "";
        for (int i = s.length()-1; i >= 0; i--){
            s2 += s.charAt(i);
        }
        System.out.println("s2 = " + s2);
    }

}
