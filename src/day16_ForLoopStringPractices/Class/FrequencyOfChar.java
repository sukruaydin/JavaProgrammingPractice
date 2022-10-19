package day16_ForLoopStringPractices.Class;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = scan.nextLine();
        System.out.println("enter a char:");
        char c = scan.next().charAt(0);

        int result = 0;

        for (int i = 0; i <= s.length()-1; i++){
            if(s.charAt(i) == c){
                result++;
            }
        }
        System.out.println("result = " + result);
    }

}
