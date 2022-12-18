package day17_WhileDoWhileBranching.Tasks;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] merged = merge(arr1,arr2);
        System.out.println(Arrays.toString(merged));


    }

    public static int[] merge(int[] arr1, int[]arr2){

        int[] merged = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {
            merged[i] = each;
            i++;
        }

        for (int each : arr2) {
            merged[i] = each;
            i++;
        }

        return merged;

    }

}
