package day20_Arrays.Class;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        //store those elements 10,20,50,70
        int[] numbers = {10,20,50,70};
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------------------------");

        //can contain 5 scores
        int[] scores = new int[5]; //now those are 0
        scores[1] = 85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));
        System.out.println("-----------------------------------");

        //print out the months one under the other
        String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("-----------------------------------");

        //print out the months one under the other starting from december
        for (int i = months.length-1; i >= 0 ; i--) {
            System.out.println(months[i]);
        }
        System.out.println("-----------------------------------");



    }

}
