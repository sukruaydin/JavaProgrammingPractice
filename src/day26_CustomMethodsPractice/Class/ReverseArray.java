package day26_CustomMethodsPractice.Class;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        a = reverse1DArray(a);
        System.out.println(Arrays.toString(a));

    }

    public static int[] reverse1DArray(int[] arr){

        int[] reversed = new int[arr.length];
        int i = reversed.length-1;
        for (int each : arr) {
            reversed[i--] = each;
        }
        return reversed;
    }
}
