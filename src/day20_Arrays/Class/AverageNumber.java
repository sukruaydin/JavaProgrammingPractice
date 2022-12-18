package day20_Arrays.Class;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many numbers will you provide?");
        int howMany = scan.nextInt();

        int[] numbers = new int[howMany];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter the "+i+" st/nd number");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        double average = sum / numbers.length;
        System.out.println("average = " + average);
    }
}
