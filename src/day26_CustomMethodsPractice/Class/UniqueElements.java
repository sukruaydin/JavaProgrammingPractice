package day26_CustomMethodsPractice.Class;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {


    public static void main(String[] args) {

        int[] a = {1,1,2,3,3};

        int[] result = uniqueElements(a);

        System.out.println(Arrays.toString(result));
    }

    //finds the unique elements from an int array, returns an array
    public static int[] uniqueElements(int[] arr){

        int[] result = {};

        for (int each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }

        return result;

    }
    //finds the unique elements from an double array, returns an array
    public static double[] uniqueElements(double[] arr){

        double[] result = {};

        for (double each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }

        return result;

    }
    //finds the unique elements from a String array, returns an array
    public static String[] uniqueElements(String[] arr){

        String[] result = {};

        for (String each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }

        return result;

    }
    //finds the unique elements from a char array, returns an array
    public static char[] uniqueElements(char[] arr){

        char[] result = {};

        for (char each : arr) {
            if (ArraysUtility.frequencyOfElement(arr,each) == 1){
                result = ArraysUtility.addElementToArray(result,each);
            }
        }

        return result;

    }




}
