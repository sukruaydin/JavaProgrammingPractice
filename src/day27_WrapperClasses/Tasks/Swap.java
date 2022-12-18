package day27_WrapperClasses.Tasks;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr = swap(arr,2,4);
        System.out.println(Arrays.toString(arr));

        String[] s = {"şükrü","hale"};
        s = swap(s,1,0);
        System.out.println(Arrays.toString(s));

    }

    //swaps the given indexes in the int array, returns array
    public static int[] swap(int[] arr, int index1, int index2){

        if (index1 < 0 || index1 > arr.length-1){
            System.err.println("Invalid index1: " + index1);
            System.exit(0);
        }
        if (index2 < 0 || index2 > arr.length-1){
            System.err.println("Invalid index2: " + index2);
            System.exit(0);
        }

        int a = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = a;

        return arr;
    }
    //swaps the given indexes in the double array, returns array
    public static double[] swap(double[] arr, int index1, int index2){

        if (index1 < 0 || index1 > arr.length-1){
            System.err.println("Invalid index1: " + index1);
            System.exit(0);
        }
        if (index2 < 0 || index2 > arr.length-1){
            System.err.println("Invalid index2: " + index2);
            System.exit(0);
        }

        double a = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = a;

        return arr;
    }
    //swaps the given indexes in the char array, returns array
    public static char[] swap(char[] arr, int index1, int index2){

        if (index1 < 0 || index1 > arr.length-1){
            System.err.println("Invalid index1: " + index1);
            System.exit(0);
        }
        if (index2 < 0 || index2 > arr.length-1){
            System.err.println("Invalid index2: " + index2);
            System.exit(0);
        }

        char a = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = a;

        return arr;
    }
    //swaps the given indexes in the String array, returns array
    public static String[] swap(String[] arr, int index1, int index2){

        if (index1 < 0 || index1 > arr.length-1){
            System.err.println("Invalid index1: " + index1);
            System.exit(0);
        }
        if (index2 < 0 || index2 > arr.length-1){
            System.err.println("Invalid index2: " + index2);
            System.exit(0);
        }

        String a = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = a;

        return arr;
    }

}
