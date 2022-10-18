package day14_String2.Tasks;

import java.util.Scanner;

public class FrequencyOfLetter5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;

                }

            }
            if(str.charAt(i) != ' '){
                newstr=newstr + str.charAt(i) + count;
            }

            str = str.replace(str.charAt(i),' ');
        }
        System.out.println(newstr);

    }
}
