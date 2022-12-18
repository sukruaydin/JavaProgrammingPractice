package day24_CustomMethods_Return.ClassTasks;

import java.util.Arrays;

public class ReversedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] reversed = reverseArray(arr);
        System.out.println(Arrays.toString(reversed));

    }

    public static int[] reverseArray(int[] arr){

        int[] reversed = new int[arr.length];

        int i = arr.length-1;
        for (int each : arr) {
            reversed[i--] = each;
        }

        return reversed;

    }
}
