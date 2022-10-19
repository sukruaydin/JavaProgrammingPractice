package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String s = scan.nextLine();
        System.out.println("enter a word:");
        String w = scan.next();

        int result = 0;

        for (int i = 0; i <= s.length()-w.length(); i++){
            if (s.substring(i,i+w.length()).equalsIgnoreCase(w)){
                result++;
            }
        }
        System.out.println("result = " + result);
    }
}
