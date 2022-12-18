package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListMethods3 {

    public static void main(String[] args) {
        //BULK OPERATIONS

        //addAll(collection) method ---> adds the collection of elements to ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //asList(array of values) --> returns the array as collectionType
        System.out.println("numbers = " + numbers);
        System.out.println("-------------------------------");

        //removeAll(collection) method ---> removes all matching elements
        numbers.removeAll(Arrays.asList(8,9,10));
        System.out.println("numbers = " + numbers);
        System.out.println("-------------------------------");

        //retainAll(collection) method ---> removes all NOT matching elements
        numbers.retainAll(Arrays.asList(1,2,3,4,5));
        System.out.println("numbers = " + numbers);
        System.out.println("-------------------------------");

        //containsAll(collection) method --> checks if the given elements are contained in the ArrayList
        boolean result = numbers.containsAll(Arrays.asList(1,3,5));
        System.out.println("result = " + result);

    }

}
