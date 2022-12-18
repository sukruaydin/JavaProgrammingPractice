package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String[] names = {"şükrü","hale","bekir","hülya"};
        //as long as we have a non-primitive array, we can send each element to an ArrayList by using as.List method
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(names));
        System.out.println("list1 = " + list1);

        Integer[] nums = {1,2,3,4,5};
        //if it was int, we wouldn't be able to send it to an ArrayList as below
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(nums));
        System.out.println("list2 = " + list2);

        int[] arr = {10,20,30};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr));
        System.out.println("list3 = " + list3);


    }

    //converts int[]arr to an ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        for (int each : arr) {
            list.add(each);
        }

        return list;

    }

}
