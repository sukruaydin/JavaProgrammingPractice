package day21_ArraysUtilityForEachLoop.Class.StringMethods;

import java.util.Arrays;

public class toCharArray {

    public static void main(String[] args) {

        //toCharArray() ---> transforms the string to char
        String s = "Java";
        //s.toCharArray ---> {'J','a','v','a'}
        for (char each : s.toCharArray()){
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        //write a program checking if two STRINGS are anagram or not
        String s1 = "acdb";
        String s2 = "bdca";

        char[] ch1 = s1.toCharArray(); Arrays.sort(ch1);
        char[] ch2 = s2.toCharArray(); Arrays.sort(ch2);

        boolean isAnagram = Arrays.equals(ch1,ch2);
        System.out.println("isAnagram = " + isAnagram);

    }

}
