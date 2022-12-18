package day26_CustomMethodsPractice.Class;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = {1,2,2,3,2,4,5,4};
        a = removeDuplicates(a);
        System.out.println(Arrays.toString(a));

    }

    //removes duplicates from int array, returns an array
    public static int[] removeDuplicates(int[] arr){

        int[] result = {};
        for (int each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    //removes duplicates from double array, returns an array
    public static double[] removeDuplicates(double[] arr){

        double[] result = {};
        for (double each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    //removes duplicates from char array, returns an array
    public static char[] removeDuplicates(char[] arr){

        char[] result = {};
        for (char each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }
    //removes duplicates from String array, returns an array
    public static String[] removeDuplicates(String[] arr){

        String[] result = {};
        for (String each : arr) {
            if (!ArraysUtility.contains(result,each)){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }
        return result;
    }

}
