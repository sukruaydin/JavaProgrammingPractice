package day21_ArraysUtilityForEachLoop.Class.ArraysUtility;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        //toString method
        String s = "java";
        System.out.println(s.toString()); //implicitly called
        int[] number = {1,2,3,4,5};
        //when printing the whole array
        //we need to call "toString" method explicitly
        //"toString" method ---> converts the (single dimensional) array objects to string
        System.out.println(Arrays.toString(number));
        //when printing an element
        //we don't need to call toString method, cuz the data type is already ok
        System.out.println(number[0]);
        System.out.println("-----------------------------------------");


        //sort method, ascending order
        //there is no descending order, but we can use reversing
        //from smaller to bigger number
        int[] scores = {95,35,64,75,19,55};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min number: " + scores[0]);
        System.out.println("Max number: " + scores[scores.length-1]);
        //when it comes to string, it is sorted according to alphabetic order,
        //which means ASCII table
        String[] names = {"gunay","anna","zuhal","ahmet","maria","sinem"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        String[] names2 = {"anna","ANNA"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));
        System.out.println("-----------------------------------------");


        //equals(arr1, arr2) method
        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};
        boolean r1 = Arrays.equals(arr1,arr2); //false
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean r2 = Arrays.equals(arr1,arr2); //true
        System.out.println(r2);
        //---> check if they are anagram or not
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r3 = Arrays.equals(ch1,ch2);
        System.out.println(r3);
        System.out.println("-----------------------------------------");






    }
}
