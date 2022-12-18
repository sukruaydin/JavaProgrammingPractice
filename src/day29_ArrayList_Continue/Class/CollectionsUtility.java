package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        //COLLECTIONS UTILITY CLASS

        //sort method --> sorts in ascending order
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(5,2,6,9,6,4,1,3));
        System.out.println("numbers = " + numbers);
        Collections.sort(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("------------------------------------");

        //reverse method
        Collections.reverse(numbers);
        System.out.println("numbers = " + numbers);
        System.out.println("------------------------------------");

        //swap method --> swaps 2 given indexes
        Collections.swap(numbers,2,5);
        System.out.println("numbers = " + numbers);
        System.out.println("------------------------------------");

        //max, min methods
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println("------------------------------------");

        //replaceAll method --> replaces all matching ones
        Collections.replaceAll(numbers,6,66);
        System.out.println("numbers = " + numbers);
        System.out.println("------------------------------------");

        //frequency method --> return int value
        int x = Collections.frequency(numbers,66);
        System.out.println("x = " + x);

    }

}
