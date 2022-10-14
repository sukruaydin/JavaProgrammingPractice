package day13_String_1.Tasks;

import java.util.Scanner;

public class LongestString {

    public static void main(String[] args) {
        //find the longest string od text
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a sentence:");
        String sentence1 = scan.nextLine();

        System.out.println("enter a sentence:");
        String sentence2 = scan.nextLine();

        String result = "";
        if((sentence1.length() > sentence2.length())){
            result = sentence1;
        }else {
            result = sentence2;
        }
        System.out.println(result);
    }
}
