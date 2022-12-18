package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

import java.util.Arrays;

public class MergeArrays2 {

    public static void main(String[] args) {

        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = new char[ch1.length + ch2.length];

        int i = 0;
        for (char each : ch1) {
            ch3[i++] = each;
        }

        for (char each : ch2) {
            ch3[i++] = each;
        }

        System.out.println(Arrays.toString(ch3));
    }

}
