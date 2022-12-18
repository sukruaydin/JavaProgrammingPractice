package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class MinNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(20);
        numbers.add(-33);
        numbers.add(419);
        numbers.add(29);
        System.out.println("numbers = " + numbers);

        int min = numbers.get(0);

        for (Integer each : numbers) {
            if (each < min) {
                min = each;
            }
        }

        System.out.println("min = " + min);

    }

}
