package day22_MultiDimentionalArrays.Class;

import java.util.Arrays;

public class MultiDimentionalArraysIntro {

    public static void main(String[] args) {
        //declaring 2D arrays
        String[] group1 = {"John","Şükrü","Muhtar"};
        String[] group2 = {"Ben","Sen","O"};
        String[] group3 = {"Biz","Siz","Onlar"};

        String[][] groups = new String[3][];
        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("-------------------------------------------");

        int[][] numbers2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
        System.out.println(numbers2D.length);
        System.out.println(Arrays.deepToString(numbers2D));
        System.out.println(Arrays.toString(numbers2D[1])); //2nd one-dimentional array
        System.out.println(numbers2D[2][3]);//11

    }

}
