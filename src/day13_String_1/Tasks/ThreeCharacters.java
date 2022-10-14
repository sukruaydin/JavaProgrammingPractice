package day13_String_1.Tasks;

import java.util.Scanner;

public class ThreeCharacters {

    public static void main(String[] args) {
        //if string has more than 3 characters => print last 3 character, otherwise print the all string
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string value:");
        String str = scan.nextLine();

        String result = (str.length()==0) ? "string is empty" :(str.length()>3) ?
                ""+str.charAt(str.length()-3)+str.charAt(str.length()-2)+str.charAt(str.length()-1) : str;

        System.out.println(result);
    }
}
