package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        String[] group1 = {"şükrü","yusuf","bahattin"};
        String[] group2 = {"xxxxx","fatih","ali"};
        String[] students = new String[group1.length + group2.length];

        int i = 0;
        for (String each : group1) {
            students[i++] = each;
        }

        for (String each : group2) {
            students[i++] = each;
        }

        System.out.println(Arrays.toString(students));
    }

}
