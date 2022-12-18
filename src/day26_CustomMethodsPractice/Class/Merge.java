package day26_CustomMethodsPractice.Class;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {

        int[] a1 = {1,2,3};
        int[] a2 = {4,5};

        int[] result = merge(a1,a2);
        System.out.println(Arrays.toString(result));

    }


    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElementToArray(result,each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElementToArray(result,each);
        }
        return result;
    }
}
