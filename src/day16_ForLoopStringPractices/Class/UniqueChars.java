package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class UniqueChars {

    public static void main(String[] args) {
        //HATALI ÇÖZÜM
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine();

        String result = "";
        for (int i = 0; i <= s.length()-1; i++){
            if (!s.substring(i+1).contains(s.charAt(i)+"")){

                result += s.charAt(i);

            }
        }
        System.out.println("result = " + result);
    }

}
