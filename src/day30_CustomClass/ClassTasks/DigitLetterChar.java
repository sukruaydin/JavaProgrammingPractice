package day30_CustomClass.ClassTasks;

import java.util.ArrayList;

public class DigitLetterChar {

    public static void main(String[] args) {

        String s = "ABCD15!½$5Kda6]";


        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }


        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf( p -> !Character.isLetter(p));
        System.out.println("letters = " + letters);



        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);



        ArrayList<Character> specialChars = new ArrayList<>(chars);
        specialChars.removeIf( p -> Character.isLetterOrDigit(p));
        System.out.println("specialChars = " + specialChars);



    }

}
