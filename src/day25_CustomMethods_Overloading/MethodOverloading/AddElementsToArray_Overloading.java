package day25_CustomMethods_Overloading.MethodOverloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] arr1 = {5,8};
        int[] added1 = addElementToArray(arr1,3);
        System.out.println(Arrays.toString(added1));

        double[] arr2 = {1.1,2.3};
        double[] added2 = addElementToArray(arr2,5.5);
        System.out.println(Arrays.toString(added2));

        String[] arr3 = {"aşk","beni","nerde"};
        String[] added3 = addElementToArray(arr3,"görse");
        String[] added3_3 = addElementToArray(added3,"tanır");
        System.out.println(Arrays.toString(added3_3));

        char[] arr4 = {'G','R'};
        arr4 = addElementToArray(arr4,'H'); //we can also assign back
        System.out.println(Arrays.toString(arr4));

    }

    public static int[] addElementToArray (int[] arr, int number){

        int[] added = new int[arr.length+1];
        int i = 0;
        for (int each : arr) {
            added[i++] = each;
        }
        added[i] = number;

        return added;
    }
    public static double[] addElementToArray (double[] arr, double number){

        double[] added = new double[arr.length+1];
        int i = 0;
        for (double each : arr) {
            added[i++] = each;
        }
        added[i] = number;

        return added;
    }
    public static String[] addElementToArray (String[] arr, String str){

        String[] added = new String[arr.length+1];
        int i = 0;
        for (String each : arr) {
            added[i++] = each;
        }
        added[i] = str;

        return added;
    }
    public static char[] addElementToArray (char[] arr, char ch){

        char[] added = new char[arr.length+1];
        int i = 0;
        for (char each : arr) {
            added[i++] = each;
        }
        added[i] = ch;

        return added;
    }
}
