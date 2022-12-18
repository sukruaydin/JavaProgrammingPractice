package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(8);
        numbers.add(8);
        System.out.println("numbers = " + numbers);

        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) == numbers.get(i+1)){
                System.out.println(numbers.get(i));
                break;
            }
        }


    }

}
