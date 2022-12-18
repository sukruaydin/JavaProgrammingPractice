package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class FrequencyOfJava2 {
    public static void main(String[] args) {
        //frequency of anything
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence:");
        String s = scan.nextLine().toLowerCase();
        System.out.println("enter a word to be searched:");
        String w = scan.next().toLowerCase();

        int howMany = 0;
        for (int i = 0; i <= s.length()-w.length(); i++){   //s.length-w.length  // i = 34

                if(w.equals(s.substring(i, i+w.length()))){
                howMany++;
            }
        }
        System.out.println("howMany = " + howMany);
    }
}
