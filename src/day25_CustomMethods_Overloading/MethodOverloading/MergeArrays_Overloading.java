package day25_CustomMethods_Overloading.MethodOverloading;

import java.util.Arrays;

public class MergeArrays_Overloading {

    public static void main(String[] args) {

        int[] intArr1 = {1,2,3};
        int[] intArr2 = {4,5};
        int[] intMerged = merge(intArr1,intArr2);
        System.out.println(Arrays.toString(intMerged));

        double[] doubleArr1 = {2.1,3.0,9.8};
        double[] doubleArr2 = {2.2,3,3};
        double[] doubleMerged = merge(doubleArr1,doubleArr2);
        System.out.println(Arrays.toString(doubleMerged));

        char[] charArr1 = {'A','B','C'};
        char[] charArr2 = {'D','E'};
        char[] charMerged = merge(charArr1,charArr2);
        System.out.println(Arrays.toString(charMerged));

        String[] stringArray1 = {"şükrü","yusuf"};
        String[] stringArray2 = {"bahattin","mwc"};
        String[] stringMerged = merge(stringArray1,stringArray2);
        System.out.println(Arrays.toString(stringMerged));


    }


    public static int[] merge(int[] arr1, int[] arr2){

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
    public static double[] merge(double[] arr1, double[] arr2){

        double[] merged = new double[arr1.length + arr2.length];

        int i = 0;
        for (double each : arr1) {
            merged[i++] = each;
        }

        for (double each : arr2) {
            merged[i++] = each;
        }

        return merged;
    }
    public static char[] merge(char[] arr1, char[] arr2){

        char[] merged = new char[arr1.length + arr2.length];

        int i = 0;
        for (char each : arr1) {
            merged[i++] = each;
        }

        for (char each : arr2) {
            merged[i++] = each;
        }

        return merged;
    }
    public static String[] merge(String[] arr1, String[] arr2){

        String[] merged = new String[arr1.length + arr2.length];

        int i = 0;
        for (String each : arr1) {
            merged[i++] = each;
        }

        for (String each : arr2) {
            merged[i++] = each;
        }

        return merged;
    }
}
