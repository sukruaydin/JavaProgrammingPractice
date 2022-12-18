package day17_WhileDoWhileBranching.Tasks;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "bcaq";
        boolean result = isAnagram(s1,s2);
        System.out.println("is Anagram = " + result);

    }

    public static boolean isAnagram(String str1, String str2){

        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        boolean result = Arrays.equals(arr1,arr2);

        return result;
    }

}
