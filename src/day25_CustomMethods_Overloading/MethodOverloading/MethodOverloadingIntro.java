package day25_CustomMethods_Overloading.MethodOverloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {
        //we have been already using overloading methods like sort method
        //we have many sorting methods with the same name
        //we can also create our overloaded methods
        //only pre-condition is --> different parameter numbers or different parameter data types / same name

        int[] arr1 = {5,3,4};
        Arrays.sort(arr1);

        double[] arr2 = {5.2,0.0,6.3};
        Arrays.sort(arr2);

        char[] arr3 = {'E','A','C'};
        Arrays.sort(arr3);

    }

}
