package day15_ForWhileLoop.While;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String s = scan.nextLine().toLowerCase();
        System.out.println("enter a word:");
        String w = scan.next().toLowerCase();

        int result = 0;

        while (s.contains(w)){
            s = s.replaceFirst(w, "");
            result++;
        }
        System.out.println("result = " + result);

    }
}
