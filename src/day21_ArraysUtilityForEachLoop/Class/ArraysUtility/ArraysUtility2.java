package day21_ArraysUtilityForEachLoop.Class.ArraysUtility;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        //copyOf(array, newLength) method
        //starts from beginning, to newLength
        String[] students = {"Elif", "Sinem","Gunay","Cihad", "David","James","Aaron","Daniel"}; //store first 3 elements
        String[] earlyBirds = Arrays.copyOf(students, 3); //3rd element is excluded
        System.out.println(Arrays.toString(earlyBirds));
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));
        System.out.println("-----------------------------");

        //copyOfRange(array,from,to) method
        //works like substring --> ending index is excluded
        char[] ch1 = {'a','b','c','d','e','f','g','h','i'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6);
        System.out.println(Arrays.toString(ch2));
        int[] scores = {10,20,30,40,50,60,70,80,90,100}; //print from 40 to 80
        int[] result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));
        int[] result2 = Arrays.copyOfRange(scores,6,scores.length);
        System.out.println(Arrays.toString(result2));

    }
}
