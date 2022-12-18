package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        //reverse the given array
        Integer[] arr = {1,2,3,4,5};

        int[] reversed = new int[arr.length];

        int x = arr.length-1;
        for (int each : arr) {
            reversed[x--] = each;
        }

        System.out.println(Arrays.toString(reversed));
        System.out.println("---------------------------");

        //reverse the given ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(arr));
        System.out.println("numbers = " + numbers);

        ArrayList<Integer> reversed2 = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0; i--) {
            reversed2.add(numbers.get(i));
        }

        System.out.println("reversed2 = " + reversed2);

    }

}
