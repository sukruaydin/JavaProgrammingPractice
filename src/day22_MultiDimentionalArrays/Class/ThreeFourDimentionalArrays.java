package day22_MultiDimentionalArrays.Class;

import java.util.Arrays;

public class ThreeFourDimentionalArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D_1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2D_2 = {{7,4,3},{9,1,7},{5,2,6}};

        int[][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}},{{7,4,3},{9,1,7},{5,2,6}}};
        System.out.println(arr3D.length); //2
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println("--------------------------------------");

        System.out.println(Arrays.deepToString(arr3D[1]));//[[7, 4, 3], [9, 1, 7], [5, 2, 6]]
        System.out.println("--------------------------------------");

        System.out.println(Arrays.toString(arr3D[1][2]));//[5, 2, 6]
        System.out.println("--------------------------------------");

        System.out.println(arr3D[1][2][0]);//5
        System.out.println("--------------------------------------");

        for (int[][] arr2D : arr3D) {
            for (int[] arr1D : arr2D) {
                for (int each : arr1D) {
                    System.out.print(each+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("--------------------------------------");

        int[][][][] arr4D = {{{{1,2,3},{4,5,6},{7,8,9}},{{7,4,3},{9,1,7},{5,2,6}}},{{{10,20,30},{40,50,60},{70,80,90}},{{70,40,30},{90,10,70},{50,20,60}}}};

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int each : each1D) {
                        System.out.print(each+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
