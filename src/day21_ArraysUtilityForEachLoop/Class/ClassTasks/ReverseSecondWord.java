package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String s = "I Love Java";
        System.out.println(s);
        String[] s1 = s.split(" ");
        System.out.println(Arrays.toString(s1));

        String result = "";
        for (int i = s1[1].length()-1; i >= 0; i--){
            result += s1[1].charAt(i);
        }
        s1[1] = result;

        for (String each : s1) {
            System.out.print(each+" ");
        }
    }

}
