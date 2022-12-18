package day17_WhileDoWhileBranching.Tasks;

public class ContainsOfArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        boolean isContained = containsOfArray(arr,10);
        System.out.println(isContained);

    }

    public static boolean containsOfArray(int[] arr, int element){

        boolean result = false;

        for (int each : arr) {
            if (each == element){
                result = true;
                break;
            }
        }

        return result;

    }

}
