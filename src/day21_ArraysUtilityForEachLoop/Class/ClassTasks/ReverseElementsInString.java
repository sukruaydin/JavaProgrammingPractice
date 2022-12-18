package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

import java.util.Arrays;

public class ReverseElementsInString {

    public static void main(String[] args) {

        String s = "Today is a good day to learn Java";
        System.out.println(s);
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));
        String s2 = "";

        for (int i = s1.length - 1; i >= 0; i--) {
            s2 += s1[i]+" ";
        }
        System.out.println(s2);

    }

}
