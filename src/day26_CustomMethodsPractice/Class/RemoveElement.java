package day26_CustomMethodsPractice.Class;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,4,5};
        a = removeElement(a,4);
        System.out.println(Arrays.toString(a));
        a = removeElement(a,4);
        System.out.println(Arrays.toString(a));

    }

    //removes the index element from an int array, returns array
    public static int[] removeElement(int[] arr, int index){

        if (index < 0 || index > arr.length){
            System.err.println("invalid index number: " + index);
        }

        int[] result = new int[arr.length-1];

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == index){
                continue;
            }
            result[i++] = arr[j];
        }

        return result;
    }
    //removes the index element from a double array, returns array
    public static double[] removeElement(double[] arr, int index){
        if (index < 0 || index > arr.length){
            System.err.println("invalid index number: " + index);
        }

        double[] result = new double[arr.length-1];

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == index){
                continue;
            }
            result[i++] = arr[j];
        }

        return result;
    }
    //removes the index element from a String array, returns array
    public static String[] removeElement(String[] arr, int index){

        if (index < 0 || index > arr.length){
            System.err.println("invalid index number: " + index);
        }
        String[] result = new String[arr.length-1];

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == index){
                continue;
            }
            result[i++] = arr[j];
        }

        return result;
    }
    //removes the index element from a char array, returns array
    public static char[] removeElement(char[] arr, int index){

        if (index < 0 || index > arr.length){
            System.err.println("invalid index number: " + index);
        }
        char[] result = new char[arr.length-1];

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (j == index){
                continue;
            }
            result[i++] = arr[j];
        }

        return result;
    }
}
