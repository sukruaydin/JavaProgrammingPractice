package day13_String_1.Tasks;

import java.util.Scanner;

public class ThreeLetterWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter three letter word:");
        String w = scan.next();
        w = w.toLowerCase();

        String result = "";
        if (w.length()==3){
            result = (w.charAt(1) == 'a') ? "cool word" : "okay word";
        } else if (w.length()>3) {
            result = "word is too long";
        }else{
            result = "word is too short";
        }
        System.out.println(result);
    }
}
