package day24_CustomMethods_Return.ClassTasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr1 ={1,2,3};
        int [] arr2 ={4,5,6,7};
        int [] arr3 ={8,9,10,11,12,13};
        //{ {13,12,11..}, {7,6,5..}, {3,2,1} }

        int[][] arr = new int[3][];

        arr[0]=arr1;
        arr[1]=arr2;
        arr[2]=arr3;

        int[][] reversed = new int[arr.length][];

        int k = reversed.length-1;
        for (int i = 0; i < reversed.length; i++) {
            int[] temp = new int[arr[i].length];
            int l = temp.length-1;
            for (int j = 0; j < temp.length; j++) {
                temp[l--] = arr[i][j];
            }
            reversed[k--] = temp;
        }

        System.out.println(Arrays.deepToString(reversed));

    }


}
