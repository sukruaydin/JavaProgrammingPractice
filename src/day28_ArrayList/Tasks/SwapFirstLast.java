package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class SwapFirstLast {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("numbers = " + numbers);

        int a = numbers.get(0);
        numbers.set(0,numbers.get(numbers.size()-1));
        numbers.set(numbers.size()-1,a);

        System.out.println("numbers = " + numbers);

    }

}
