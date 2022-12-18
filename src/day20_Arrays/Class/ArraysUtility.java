package day20_Arrays.Class;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = {10,3,5,9,7,77,64};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers); //sorts the array from smaller to bigger
        System.out.println(Arrays.toString(numbers));
    }
}
