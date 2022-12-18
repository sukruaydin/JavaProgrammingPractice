package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class SetZero {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("numbers = " + numbers);

        numbers.set(numbers.size()-1,0);
        System.out.println("numbers = " + numbers);

    }

}
