package day17_WhileDoWhileBranching.Tasks;

public class FrequencyOfArray {

    public static void main(String[] args) {

        int[] arr = {1,1,1,2,3,5,9,1,3};
        int count = frequencyOfArray(arr,1);
        System.out.println("count = " + count);

    }

    public static int frequencyOfArray(int[] arr, int number){

        int count = 0;
        for (int each : arr) {
            if (each == number){
                count++;
            }
        }

        return count;

    }

}
