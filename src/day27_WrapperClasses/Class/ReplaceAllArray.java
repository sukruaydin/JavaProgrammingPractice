package day27_WrapperClasses.Class;

import java.util.Arrays;

public class ReplaceAllArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,5,2};
        arr = replaceAll(arr,2,88);
        System.out.println(Arrays.toString(arr));

        String[] array = {"java","hale","hale","şükrü","hale"};
        array = replaceAll(array,"hale","boss");
        System.out.println(Arrays.toString(array));

    }

    //replacing all the matching oldValues with the newValues in the int array, returns an array
    public static int[] replaceAll(int[] arr, int oldValue, int newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    //replacing all the matching oldValues with the newValues in the double array, returns an array
    public static double[] replaceAll(double[] arr, double oldValue, double newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    //replacing all the matching oldValues with the newValues in the char array, returns an array
    public static char[] replaceAll(char[] arr, char oldValue, char newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue){
                arr[i] = newValue;
            }
        }

        return arr;
    }
    //replacing all the matching oldValues with the newValues in the String array, returns an array
    public static String[] replaceAll(String[] arr, String oldValue, String newValue){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }

        return arr;
    }


}
