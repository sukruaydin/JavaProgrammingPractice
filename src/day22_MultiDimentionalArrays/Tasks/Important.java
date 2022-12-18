package day22_MultiDimentionalArrays.Tasks;

import java.util.Arrays;

public class Important {

    public static void main(String[] args) {


        int[] s = new int[2];
        s[0] = 1;
        s[1] = 2;
        System.out.println(Arrays.toString(s));
        System.out.println("-----------------------------------------");

        int[][] s2D = new int[2][];
        int[] a = {1,2,3};
        s2D [0] = a;

        //s2D[1] = {1,2,3};

       /* s2D[0][0] = 1;
        s2D[0][1] = 2;
        s2D[1][0] = 2;
        s2D[1][1] = 2;*/
        System.out.println(Arrays.deepToString(s2D));
        System.out.println("-----------------------------------------");



    }

}
