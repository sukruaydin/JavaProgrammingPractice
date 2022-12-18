package day17_WhileDoWhileBranching.Tasks;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};
        int[] arr2 = removeElement(arr1,3);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] removeElement(int[] arr, int element){

        int[] last = new int[arr.length-1];

        if (element < 0 || element > arr.length){
            System.err.println("invalid element index given");
        }else {
            int i = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == element){
                    continue;
                }
                last[i] = arr[j];
                i++;
            }

        }
        return last;

    }

}
