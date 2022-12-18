package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class FrequencyOfJava3 {
    public static void main(String[] args) {
        //Boss' answer
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String str = scan.nextLine();
        str = str.toLowerCase();
        System.out.println("Enter searching word : ");
        String s = scan.nextLine();
        s = s.toLowerCase();

        int counter2 = 0;
        String value = "";

        for (int i = 0; i < str.length()-s.length()+1; i++) {
            int counter1 = 1;
            if (str.charAt(i) == s.charAt(0)){
                for (int j = 1; j < s.length(); j++) {
                    if (s.charAt(j) == str.charAt(i+j)){
                        counter1++;
                        if (counter1 == s.length()){
                            counter2++;
                        }
                    }
                }
            }
        }
        System.out.println("counter2 = " + counter2);
    }
}
