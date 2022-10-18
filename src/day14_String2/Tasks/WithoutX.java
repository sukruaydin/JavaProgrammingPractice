package day14_String2.Tasks;

import java.util.Scanner;

public class WithoutX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word:");
        String word = scan.next();

        if (word.charAt(0) == 'x'){
            System.out.println(word.substring(1));
        }else {
            System.out.println(word);
        }

    }
}
