package day14_String2.Tasks;

import java.util.Scanner;

public class FrequencyOfLetter6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = scan.next().toLowerCase();

        String result = "";

        for (int i = 0; i <= s.length()-1 ; i++) {
            int count = 0;


            for (int j = 0; j <= s.length()-1 ; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+s.charAt(i))){
                continue;
            }
            result += s.charAt(i);
            result += count;
        }
        System.out.print(result);



    }
}
