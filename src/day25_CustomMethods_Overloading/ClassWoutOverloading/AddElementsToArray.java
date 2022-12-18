package day25_CustomMethods_Overloading.ClassWoutOverloading;

import java.util.Arrays;

public class AddElementsToArray {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] added1 = addElementIntArray(arr1,5);
        System.out.println(Arrays.toString(added1));

        double[] arr2 = {5.5,3.4,8.9,2.0};
        double[] added2 = addElementDoubleArray(arr2,0.0);
        System.out.println(Arrays.toString(added2));

        String[] arr3 = {"şükrü","yusuf"};
        String[] added3 = addElementStringArray(arr3,"bahattin");
        System.out.println(Arrays.toString(added3));

        char[] arr4 = {'1','3'};
        char[] added4 = addElementCharArray(arr4,'5');
        System.out.println(Arrays.toString(added4));

    }

    public static int[] addElementIntArray (int[] arr, int number){

        int[] added = new int[arr.length+1];
        int i = 0;
        for (int each : arr) {
            added[i++] = each;
        }
        added[i] = number;

        return added;
    }
    public static double[] addElementDoubleArray (double[] arr, double number){

        double[] added = new double[arr.length+1];
        int i = 0;
        for (double each : arr) {
            added[i++] = each;
        }
        added[i] = number;

        return added;
    }
    public static String[] addElementStringArray (String[] arr, String str){

        String[] added = new String[arr.length+1];
        int i = 0;
        for (String each : arr) {
            added[i++] = each;
        }
        added[i] = str;

        return added;
    }
    public static char[] addElementCharArray (char[] arr, char ch){

        char[] added = new char[arr.length+1];
        int i = 0;
        for (char each : arr) {
            added[i++] = each;
        }
        added[i] = ch;

        return added;
    }
}
