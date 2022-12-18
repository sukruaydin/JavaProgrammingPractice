package day28_ArrayList.Class;

import java.util.ArrayList;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println("list = " + list);
        Integer x = 200;
        boolean r = list.remove(x);
        System.out.println("r3 = " + r);
        System.out.println("list = " + list);

    }

}
