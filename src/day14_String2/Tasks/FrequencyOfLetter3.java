package day14_String2.Tasks;

import java.util.Scanner;

public class FrequencyOfLetter3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.next().toLowerCase();

        String result = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            int count = 0;
            char c = s.charAt(i);

            for (int j = 0; j <= s.length() - 1; j++) {
                char d = s.charAt(j);
                if (c == d) {
                    count++;
                }
            }
            if (result.contains(c+"")){
                continue;
            }
            result += c ;
            result += count;

        }
        System.out.print(result);
    }
}
