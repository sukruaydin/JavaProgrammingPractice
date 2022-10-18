package day14_String2.Tasks;

import java.util.Scanner;

public class ConcatenatingTwoWords {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter word 1:");
        String w1 = scan. next();
        System.out.println("enter word 2:");
        String w2 = scan.next();

        char ch1 = w1.charAt(w1.length()-1);
        char ch2 = w2.charAt(0);


        if (ch1 == ch2){
            System.out.println(w1+w2.substring(1));
        }else{
            System.out.println(w1+w2);
        }
    }
}
