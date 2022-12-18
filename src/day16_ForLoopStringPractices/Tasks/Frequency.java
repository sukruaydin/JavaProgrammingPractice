package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        //frequency of a char
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = scan.nextLine();
        System.out.println("enter a char:");
        char c = scan.next().charAt(0);

        int howMany = 0;
        for (int i = 0; i <= s.length()-1 ; i++) {
            if(s.charAt(i) == c){
                howMany++;
            }

        }
        System.out.println("howMany = " + howMany);

    }
}
