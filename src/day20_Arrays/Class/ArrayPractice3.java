package day20_Arrays.Class;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like to create?");
        int howMany = scan.nextInt();

        if (howMany <= 0){
            System.err.println("invalid entry");
            System.exit(0);
        }

        int[] numbers = new int[howMany];
        for (int i = 0; i < numbers.length; i++){
            System.out.println("enter " +i+" st/nd indexed element" );
            numbers[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
