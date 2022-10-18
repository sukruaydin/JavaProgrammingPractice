package day14_String2.Tasks;

import java.util.Scanner;

public class WoutFirstChar {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("word 1:");
        String w1 = scan.next();
        w1 = w1.substring(1);

        System.out.println("word 2:");
        String w2 = scan.next();
        w2 = w2.substring(1);

        System.out.println(w1+w2);

    }

}
