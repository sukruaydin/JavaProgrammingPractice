package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class RemoveDuplicates2 {

    public static void main(String[] args) {
        //remove the duplicates
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        String result = "";
        for (int i = 0; i <= s.length()-1; i++){
            if (!result.contains(s.charAt(i)+"")){
                result += s.charAt(i);
            }
        }
        System.out.println("result = " + result);
    }

}
