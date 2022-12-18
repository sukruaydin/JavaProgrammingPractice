package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class MultiplyOdd {

    public static void main(String[] args) {

        //multiply odd numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("numbers = " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 != 0){
                numbers.set(i,numbers.get(i)*2);
            }
        }

        System.out.println("numbers = " + numbers);

    }

}
