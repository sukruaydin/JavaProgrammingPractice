package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        String s2 = "";
        String s3 = "";
        for (int i = 0; i <= s.length()-1; i++){
            s2 = "" + s.charAt(i);
            if(s.substring(i+1).contains(s2)){
            }else {
                s3 += s2;
            }
        }
        System.out.println("s3 = " + s3);


    }

}
