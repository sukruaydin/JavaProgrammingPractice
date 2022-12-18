package day21_ArraysUtilityForEachLoop.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class SortAnArray {

    public static void main(String[] args) {
        //sort an array in descending way
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];
        System.out.println("provide array elements:");
        for (int i = 0; i < numbers.length; i++){ //ForEach not allowed
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] descending = new int[numbers.length];

        int i = descending.length-1;
        for (int each : numbers){
            descending[i--] = each;
        }
        System.err.println(Arrays.toString(descending));
    }

}
