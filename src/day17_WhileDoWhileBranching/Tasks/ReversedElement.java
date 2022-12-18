package day17_WhileDoWhileBranching.Tasks;

import java.util.Arrays;

public class ReversedElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] reversed = reverseElement(arr);
        System.out.println(Arrays.toString(reversed));

    }

    public static int[] reverseElement(int[] arr){

        int[] reversed = new int[arr.length];

        int i = reversed.length-1;
        for (int each : arr) {
            reversed[i] = each;
            i--;
        }

        return reversed;

    }

}
