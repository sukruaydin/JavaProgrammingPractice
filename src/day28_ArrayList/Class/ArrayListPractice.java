package day28_ArrayList.Class;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        //multiply each element by 2
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println("numbers = " + numbers);


        for (int i = 0; i < numbers.size(); i++){
            numbers.set(i,numbers.get(i)*2);
        }

        System.out.println("numbers = " + numbers);
    }

}
