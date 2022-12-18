package day30_CustomClass.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0,5,0));

        int zero = Collections.frequency(list1,0);
        System.out.println("zero = " + zero);

        list1.removeAll(Arrays.asList(0));
        System.out.println("list1 = " + list1);

        for (int i = 0; i < zero; i++) {
            list1.add(0);
        }

        System.out.println("list1 = " + list1);

    }

}
