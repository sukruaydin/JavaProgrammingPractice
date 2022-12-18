package day25_CustomMethods_Overloading.MethodOverloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        ArraysUtility.printEachElement(arr1);
        System.out.println("----------------------------------");

        double[] arr2 = {0.5,9.8};
        ArraysUtility.printEachElement(arr2);
        System.out.println("----------------------------------");

        char[] arr3 = {'A','C'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("----------------------------------");

        String[] arr4 = {"şü","k","rü"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("----------------------------------");

        int[] arr = {2,99,5};
        int max = ArraysUtility.maxNumber(arr);
        System.out.println("max = " + max);
        double[] numbers = {1.1,5.7,0.5};
        System.out.println(ArraysUtility.maxNumber(numbers));
        System.out.println("----------------------------------");

        int[] arr5 = {2,99,5};
        System.out.println("min: "+ArraysUtility.minNumber(arr5));
        double[] numbers5 = {1.1,5.7,0.5};
        System.out.println("min: "+ArraysUtility.minNumber(numbers5));
        System.out.println("----------------------------------");

        //contains int arrays
        int[] intArr = {1,2,3,4,5};
        boolean result = ArraysUtility.contains(intArr,1);
        System.out.println("result = " + result);
        //contains double arrays
        double[] doubleArr1 = {2.0,3.5,5.9};
        System.out.println(ArraysUtility.contains(doubleArr1,6.6));
        //contains char array
        char[] charArray = {'A','M','Y'};
        System.out.println(ArraysUtility.contains(charArray,'M'));
        //contains String array
        String[] array = {"istanbul", "bağcılar","üsküdar"};
        System.out.println(ArraysUtility.contains(array,"ÜSKÜDAR"));
        System.out.println("----------------------------------");












        //merge 2 int arrays
        int[] arr8 = {1,2,3};
        int[] arr9 = {4,5};
        int[] merged = ArraysUtility.merge(arr8,arr9);
        System.out.println(Arrays.toString(merged));
        //merge 2 double arrays
        double[] arr6 = {2.1,3.5,5.0};
        double[] arr7 = {9.8,4.1};
        double[] merged2 = ArraysUtility.merge(arr6,arr7);
        System.out.println(Arrays.toString(merged2));
        //merge 2 char arrays
        char[] charArr1 = {'G','E'};
        char[] charArr2 = {'Z','İ'};
        char[] merged3 = ArraysUtility.merge(charArr1,charArr2);
        System.out.println(Arrays.toString(merged3));
        //merge 2 String arrays
        String[] array1 = {"şükrü","wooden","spoon"};
        String[] array2 = {"istanbul","bağcılar"};
        String[] merged8 = ArraysUtility.merge(array1,array2);
        System.out.println(Arrays.toString(merged8));
        System.out.println("----------------------------------");



    }
}
