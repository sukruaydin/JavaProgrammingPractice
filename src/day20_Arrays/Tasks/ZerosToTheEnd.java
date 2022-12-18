package day20_Arrays.Tasks;

import java.util.Arrays;

public class ZerosToTheEnd {

    public static void main(String[] args) {
        //zeros to the end
        int[] number = {10,0,5,0,1,0,45,74,0};
        int[] reverse = new int[number.length];

        int j = 0;
        int k = reverse.length-1;
        for (int i = 0; i < reverse.length; i++) {

            if (number[i] != 0){
                reverse[j] = number[i];
                j++;
            }else {
                reverse[k] = number[i];
                k--;
            }
        }
        System.out.println(Arrays.toString(reverse));

    }
}
