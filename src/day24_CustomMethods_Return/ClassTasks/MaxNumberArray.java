package day24_CustomMethods_Return.ClassTasks;

public class MaxNumberArray {
    public static void main(String[] args) {

        int[] arr1 = {0,1,2,3,-5,4,5,18};
        int result = maxNumberOfArray(arr1);
        System.out.println("result = " + result);
    }

    public static int maxNumberOfArray(int[] arr){

        int max = arr[0];
        for (int each : arr) {
            if (each > max){
                max = each;
            }
        }
        return max;

    }
}
