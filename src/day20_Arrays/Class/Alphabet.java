package day20_Arrays.Class;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        //print out the letter from Z-A
        char[] alphabet = new char[26];
        char c = 'Z';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = c--;
        }
        System.out.println(Arrays.toString(alphabet));

        for (char i = 0, j = 'Z'; i < alphabet.length; i++,j--) {
            alphabet[i] = j;
        }
        
    }
}
