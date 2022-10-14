package day13_String_1.Tasks;

import java.util.Scanner;

public class FirstLastChar {

    public static void main(String[] args) {
        //print the first and last characters of 2 string of text
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a sentence:");
        String sentence = scan.nextLine();
        char firstCh = sentence.charAt(0);
        int length = sentence.length();
        char lastCh = sentence.charAt(length-1);
        System.out.println(firstCh +","+ lastCh);



    }
}
