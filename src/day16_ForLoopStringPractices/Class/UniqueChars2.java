package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class UniqueChars2 {

    public static void main(String[] args) {
        //find unique chars
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        String result = "";
        for (int i = 0; i <= s.length()-1; i++){
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                result += s.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }

}
