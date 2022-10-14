package day13_String_1.Tasks;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter word 1:");
        String w1 = scan.next();

        System.out.println("enter word 2:");
        String w2 = scan.next();

        System.out.println("enter word 3:");
        String w3 = scan.next();

        String result = "";
        if (w1.length() == w2.length() && w2.length()== w3.length()){
            result = "all words are same length";
        } else if (w1.length() != w2.length() && w1.length() != w3.length() && w1.length() != w3.length()) {
            result = "all different length";
        }else{
            result = "not Same nor different lengths";
        }
        System.out.println(result);

    }
}
