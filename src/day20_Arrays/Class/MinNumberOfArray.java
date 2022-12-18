package day20_Arrays.Class;

public class MinNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,74,956,3,4,8774};

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("min = " + min);

    }
}
