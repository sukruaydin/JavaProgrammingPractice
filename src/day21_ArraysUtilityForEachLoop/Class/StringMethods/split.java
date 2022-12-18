package day21_ArraysUtilityForEachLoop.Class.StringMethods;


import java.util.Arrays;

public class split {

    public static void main(String[] args) {

        //split method ---> transforms a string to string array
        String s1 = "I love learning java programming language";
        String[] s2 = s1.split(" ");//space not included
        System.out.println(Arrays.toString(s2));
        System.out.println("----------------------------------");

        String s3 = "ŞÜKRÜ";
        String[] s4 = s3.split("");
        System.out.println(Arrays.toString(s4));
        System.out.println("----------------------------------");

        String s5 = "Wooden Spoon";
        String[] s6 = s5.split(" "); //space not included
        System.out.println(Arrays.toString(s6));
        System.out.println("----------------------------------");

        String email = "woodenspoon@cydeo.com"; //print out the domain
        String[] arr = email.split("@"); //@ not included
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");

        String s7 = "Şükrü is a good-looking guy. Şükrü is a good man. Şükrü is so clever";
        //for dot(.) we have to use two backslashes
        String[] s8 = s7.split("\\. ");
        System.out.println(Arrays.toString(s8));

    }

}
