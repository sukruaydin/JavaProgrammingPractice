package day17_WhileDoWhileBranching.Tasks;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int[] result = addElement(arr,5);
        System.out.println(Arrays.toString(result));
    }

    public static int[] addElement(int[] arr, int number){

        int[] newArray = new int[arr.length+1];
        int i = 0;
        for (int each : arr) {
            newArray[i] = each;
            i++;
        }
        newArray[i] = number;

        return newArray;
    }

}
