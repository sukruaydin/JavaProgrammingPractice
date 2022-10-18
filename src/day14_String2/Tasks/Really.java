package day14_String2.Tasks;

import java.util.Scanner;

public class Really {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word");
        String word = scan.next();

        int ly = word.length();
        char ch1 = word.charAt(ly-1);
        char ch2 = word.charAt(ly-2);

        if(ch1 == 'y' && ch2 == 'l'){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }

    }
}
