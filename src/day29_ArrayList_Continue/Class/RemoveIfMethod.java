package day29_ArrayList_Continue.Class;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {


        //remove all odd numbers
        //we shouldn't use remove in loop
        //the task is impossible to be done without removeIf method, let's see
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0){
                list.remove(i); //called suspicious use, cuz size is already keep changing while removing
            }
        }
        System.out.println("list = " + list);
        System.out.println("--------------------------------------------------");
        
        //remove the elements less than 4
        //REMOVE IF implicitly uses ITERABLE
        //lambda expression
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println("list2 = " + list2);
        list2.removeIf( p -> p < 4);
        System.out.println("list2 = " + list2);
        System.out.println("--------------------------------------------------");

        //remove even numbers
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("list3 = " + list3);
        list3.removeIf( p -> p%2 == 0);
        System.out.println("list3 = " + list3);
        System.out.println("--------------------------------------------------");

        //remove elements starting with 'J'
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Java","Python","JavaScript","C#","C++","Java"));
        System.out.println("list4 = " + list4);
        list4.removeIf( p -> p.startsWith("J"));
        System.out.println("list4 = " + list4);
        System.out.println("--------------------------------------------------");

        //remove palindrome elements
        ArrayList<String> list5 = new ArrayList<>(Arrays.asList("Anna","level","Racecar","Eye","Cydeo"));
        System.out.println("list5 = " + list5);
        list5.removeIf( p -> StringUtility.isPanlindrome(p));
        System.out.println("list5 = " + list5);



        /*
        Remove functions:

        remove():    --> when we remove one element. DO NOT use it in the loop
        removeAll(): --> (bulk) when we remove multiple elements ( if the elements that we want to remove are known)
        retainAll(): --> (bulk) when we want to retain multiple elements (if the elements that we want to retain are known)
        removeIf():  --> when we remove under a condition (if the elements we want to remove are unknown)

        */




    }

}
