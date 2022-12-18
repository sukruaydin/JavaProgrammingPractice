package day24_CustomMethods_Return.ClassTasks;

public class MinNumberArray {

    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,-5,4,5,18};
        int result = minNumberOfArray(arr1);
        System.out.println("result = " + result);
    }

    public static int minNumberOfArray(int[] arr){

        int min = arr[0];
        for (int each : arr) {
            if (each < min){
                min = each;
            }
        }
        return min;

    }
}
