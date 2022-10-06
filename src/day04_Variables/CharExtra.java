package day04_Variables;

public class CharExtra {

    public static void main(String[] args) {

        char ch = 'a';
        int i = 1 + ch; // in int -> behaves like a number from ascii table
        System.out.println("i = " + i);
        String str = "j" + ch; // in string -> behaves like a character
        System.out.println("str = " + str);


    }

}
