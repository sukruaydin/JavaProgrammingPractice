package day21_ArraysUtilityForEachLoop.Tasks;

import java.util.Arrays;

public class MergeThreeArrays {

    public static void main(String[] args) {

        int[] arr1 = {30, 10, 20};
        int[] arr2 = {15, 40, 25, 35};
        int[] arr3 = {8, 9, 17, 5, 4, 1};
        int[] arr4 = new int[arr1.length + arr2.length + arr3.length];

        int i = 0;
        for (int each : arr1) {
            arr4[i++] = each;
        }

        for (int each : arr2) {
            arr4[i++] = each;
        }

        for (int each : arr3) {
            arr4[i++] = each;
        }

        System.out.println(Arrays.toString(arr4));
    }

}
