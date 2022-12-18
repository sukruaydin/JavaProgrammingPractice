package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

import java.util.Arrays;

public class ReverseElementsOfArray {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int[] reversed = new int[numbers.length];

        int i = reversed.length-1;
        for (int each : numbers){
            reversed[i] = each;
            i--;
        }
        System.out.println(Arrays.toString(reversed));
    }

}
