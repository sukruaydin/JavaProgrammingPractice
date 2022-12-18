package day29_ArrayList_Continue.Class;

import java.util.ArrayList;

public class MinMaxAverage {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(19);
        numbers.add(9);
        numbers.add(20);
        numbers.add(95);
        System.out.println("numbers = " + numbers);

        int max = numbers.get(0);
        int min = numbers.get(0);
        int sum = 0;

        for (Integer each : numbers) {
            if (each > max){
                max = each;
            }

            if (each < min){
                min = each;
            }

            sum += each;
        }

        double average = sum / (double)(numbers.size());

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);


    }

}
