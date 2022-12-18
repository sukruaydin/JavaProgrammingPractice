package day26_CustomMethodsPractice.Class;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement2 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,4,5};
        a = removeElement(a,4);
        a = removeElement(a,4);
        System.out.println(Arrays.toString(a));
    }

    public static int[] removeElement(int[] arr, int index){

        if (index < 0 || index > arr.length){
            System.err.println("invalid index number: " + index);
        }

        int[] result = {};

        for (int i = 0; i < arr.length; i++) {
            if (i != index){
                result = ArraysUtility.addElementToArray(result,arr[i]);
            }
        }
        return result;
    }
}
