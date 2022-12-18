package day20_Arrays.Class;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxOfArray {

    public static void main(String[] args) {
        //find min max number
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the "+i+" st/nd number");
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


        scan.close();
    }
}
