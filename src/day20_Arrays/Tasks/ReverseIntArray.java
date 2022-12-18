package day20_Arrays.Tasks;

import java.util.Arrays;

public class ReverseIntArray {

    public static void main(String[] args) {
        //reverse an array
        int[] n = {4,9,3,1};
        int[] reversedn = new int[n.length];

        int j = n.length-1;
        for (int i = 0; i < n.length; i++) {
            reversedn[i] = n[j];
            j--;
        }
        System.out.println(Arrays.toString(reversedn));

    }
}
