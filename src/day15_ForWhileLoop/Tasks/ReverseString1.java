package day15_ForWhileLoop.Tasks;

import java.util.Scanner;

public class ReverseString1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word:");
        String word = scan.nextLine();

        for (int i = word.length()-1; i >= 0; i--) {
            String word2 = "" + word.charAt(i); //if you assign that value again the "word" variable, for loop ends
            System.out.print(word2);
            //2nd way ---> System.out.print(word.charAt(i));
        }


    }
}
