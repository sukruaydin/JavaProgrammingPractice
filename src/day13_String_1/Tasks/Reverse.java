package day13_String_1.Tasks;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter five letter word:");
        String w = scan.next();

        String result = "";
        if (w.length()==5){
            result = ""+w.charAt(4)+w.charAt(3)+w.charAt(2)+w.charAt(1)+w.charAt(0);
        } else if (w.length()>5) {
            result = "word is too long";
        }else {
            result = "word is too short";
        }
        System.out.println(result);
    }
}
