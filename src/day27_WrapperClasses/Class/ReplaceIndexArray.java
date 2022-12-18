package day27_WrapperClasses.Class;

import java.util.Arrays;

public class ReplaceIndexArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr = replaceIndex(arr,2,30);
        System.out.println(Arrays.toString(arr));


        String[] s = {"java","şükrü","aydın"};
        s = replaceIndex(s,1,"hale");
        System.out.println(Arrays.toString(s));


    }

    //replace the element of the int array at given index with the new element, returns array
    public static int[] replaceIndex(int[] arr, int index, int number){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        arr[index] = number;

        return arr;
    }
    //replace the element of the double array at given index with the new element, returns array
    public static double[] replaceIndex(double[] arr, int index, double number){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        arr[index] = number;

        return arr;
    }
    //replace the element of the char array at given index with the new element, returns array
    public static char[] replaceIndex(char[] arr, int index, char ch){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        arr[index] = ch;

        return arr;
    }
    //replace the element of the String array at given index with the new element, returns array
    public static String[] replaceIndex(String[] arr, int index, String str){
        if (index < 0 || index > arr.length-1){
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        arr[index] = str;

        return arr;
    }

}
