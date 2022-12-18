package day20_Arrays.Class;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        //print out the letters in an array ---> my way
        char[] letters = new char[26];
        char c = 65;
        for (int i = 0; i < letters.length; i++) {
            letters[i] = c;
            c++;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("-------------------------------------------------------");

        //print out the letters in an array (more advanced way)
        char[] letters2 = new char[26];
        for (char i = 0, j = 'A'; i < letters2.length && j <= 'Z'; i++, j++) {
            letters2[i] = j;
        }
        System.out.println(Arrays.toString(letters2));
        System.out.println("-------------------------------------------------------");

        //print out the letter from Z-A
        char[] letters3 = new char[26];
        for (char i = 0, j = 'Z'; i < letters3.length && j >= 'A'; i++, j--) {
            letters3[i] = j;
        }
        System.out.println(Arrays.toString(letters3));

    }
}
