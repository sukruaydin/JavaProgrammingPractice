package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(20);
        numbers.add(33);
        numbers.add(419);
        numbers.add(29);
        System.out.println("numbers = " + numbers);

        int max = numbers.get(0);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }

        System.out.println("max = " + max);

    }

}
