package day27_WrapperClasses.Class;

import java.util.Arrays;

public class ReplaceFirstArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,4,5,2};
        arr = replaceFirst(arr,2,88);
        arr = replaceFirst(arr,2,88);
        arr = replaceFirst(arr,2,88);
        System.out.println(Arrays.toString(arr));

    }

    //replaces the first matching element with the new one in int array, returns array
    public static int[] replaceFirst(int[] arr, int oldValue, int newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
                break;
            }
        }

        return arr;
    }
    //replaces the first matching element with the new one in double array, returns array
    public static double[] replaceFirst(double[] arr, double oldValue, double newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
                break;
            }
        }

        return arr;
    }
    //replaces the first matching element with the new one in char array, returns array
    public static char[] replaceFirst(char[] arr, char oldValue, char newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
                break;
            }
        }

        return arr;
    }
    //replaces the first matching element with the new one in String array, returns array
    public static String[] replaceFirst(String[] arr, String oldValue, String newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
                break;
            }
        }

        return arr;
    }

}
