package day29_ArrayList_Continue.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8,8));

        int n = 2; //nth largest number
        Integer max = 0;

        for (int i = 1; i < n; i++){
            max = Collections.max(numbers);
            numbers.removeAll(Arrays.asList(max));
        }

        max = Collections.max(numbers);
        System.out.println("max = " + max);


    }

}
