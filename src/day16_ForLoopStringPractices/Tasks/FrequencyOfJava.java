package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {
        //frequency of java
        System.out.println("enter a string:");
        String s = new Scanner(System.in).nextLine().toLowerCase();

        int howMany = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) == 'j') {
                if (s.charAt(i + 1) == 'a') {
                    if (s.charAt(i + 2) == 'v'){
                        if (s.charAt(i + 3) == 'a'){
                            howMany++;
                        }
                    }

                }

            }
        }
        System.out.println("howMany = " + howMany);
    }
}
