package day22_MultiDimentionalArrays.Tasks;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1,88,2,3},{41,4,5,6,65}};
        int[][] reversed = new int[arr2D.length][];

        for (int i = 0; i < arr2D.length; i++){
            int[] temp = new int[arr2D[i].length];
            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(arr2D[i].length-1)-j] = arr2D[i][j];
            }
            reversed[(reversed.length-1)-i] = temp;
        }
        System.out.println(Arrays.deepToString(reversed));
    }

}
