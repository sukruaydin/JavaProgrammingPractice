package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class DigitLetterChar {

    public static void main(String[] args) {
        //distinguish the digits, chars, and special characters from given string
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i <= s.length()-1; i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                letters += "" + s.charAt(i);
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digits += ""+ s.charAt(i);
            }else{
                if(s.charAt(i) != ' '){//ignoring space
                    specialChars += "" + s.charAt(i);
                }

            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}
