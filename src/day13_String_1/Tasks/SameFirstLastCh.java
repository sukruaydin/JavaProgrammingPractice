package day13_String_1.Tasks;

import java.util.Scanner;

public class SameFirstLastCh {


    public static void main(String[] args) {
        //find out if the first and last characters are SAME or NOT
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word or sentence:");
        String str = scan.nextLine();

        if (str.charAt(0) == str.charAt(str.length()-1)){
            System.out.println("first and last character are same");
        }else {
            System.out.println("first and last character are NOT same");
        }

    }

}
