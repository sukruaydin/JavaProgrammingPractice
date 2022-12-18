package day24_CustomMethods_Return.ClassTasks;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};

        int[] merged = merge2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] merge2Arrays(int[] arr1, int[] arr2){

        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            merged[i++] = each;
        }

        for (int each : arr2) {
            merged[i++] = each;
        }

        return merged;
    }
}
