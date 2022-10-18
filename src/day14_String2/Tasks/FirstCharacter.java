package day14_String2.Tasks;

import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word:");
        String w = scan.next();

        if (w.charAt(0) >= 48 && w.charAt(0)<= 57){
            System.out.println("first character is a digit");
        } else if (w.charAt(0) >= 65 && w.charAt(0)<= 90) {
            System.out.println("first character is an UPPERCASE");
        } else if (w.charAt(0) >= 97 && w.charAt(0)<= 122) {
            System.out.println("first character is a LOWERCASE");
        }    else{
            System.out.println("first character is a special character");
        }

    }
}
