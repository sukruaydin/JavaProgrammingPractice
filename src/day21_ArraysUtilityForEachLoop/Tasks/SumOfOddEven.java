package day21_ArraysUtilityForEachLoop.Tasks;

public class SumOfOddEven {

    public static void main(String[] args) {

        int[] numbers = {1,9,4,6,8};

        int totalOdd = 0;
        int totalEven = 0;
        for (int each : numbers) {
            if (each%2 == 0){
                totalEven += each;
            }else{
                totalOdd += each;
            }
        }
        System.out.println("totalEven = " + totalEven);
        System.out.println("totalOdd = " + totalOdd);

    }

}
