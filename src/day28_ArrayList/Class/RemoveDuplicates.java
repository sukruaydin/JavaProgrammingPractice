package day28_ArrayList.Class;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(40);

        System.out.println("numbers = " + numbers);

        ArrayList<Integer> removedDuplicates = new ArrayList<>();

        for (Integer each : numbers) {
            if (!(removedDuplicates.contains(each))){
                removedDuplicates.add(each);
            }
        }

        System.out.println("removedDuplicates = " + removedDuplicates);

    }

}
