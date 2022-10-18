package day14_String2.Tasks;

import java.util.Scanner;

public class FrequencyOfLetter2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        String s = scan.next().toLowerCase();

        String result = "";

        for (int i = 0; i < s.length() ; i++) {
            int count = 0;
            String a = s;
            while(a.contains(""+a.charAt(i))){
                String c = ""+ a.charAt(i);
                a = a.replaceFirst(c,"");
                count++;
            }

            result += ""+a.charAt(i)+count;
        }
        System.out.print(result);
    }
}
