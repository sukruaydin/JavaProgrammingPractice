package day14_String2.Tasks;

import java.util.Scanner;

public class FrequencyOfLetter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.next().toLowerCase();

        String result = "";
        String result2 = "";

        for (int i = 0; i <= s.length()-1 ; i++) {
            int count = 0;
            String c = ""+ s.charAt(i);
            if (!(result2.contains(c))){
                for (int j = 0; j <= s.length()-1; j++) {
                    result = c;
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                result2 += result+count;

            }

        }
        System.out.print(result2);


    }

}
