package day28_ArrayList.Class;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("ahmet");
        names.add("mehmet");
        names.add("hakan");
        names.add("fatih");
        names.add("hakan");
        System.out.println("names = " + names);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("numbers = " + numbers);

        //indexOf(), lastIndexOf() methods
        int x = names.indexOf("hakan");
        System.out.println("x = " + x);
        int y = names.lastIndexOf("hakan");
        System.out.println("y = " + y);

        Integer a = 30;  //it doesn't matter if we provide object or primitive inside the indexOf method
        int z = numbers.indexOf(10);
        System.out.println("z = " + z);
        int b = numbers.lastIndexOf(a);
        System.out.println("b = " + b);
        System.out.println("-------------------------------------");


        //contains() method
        boolean r = names.contains("şükrü");//false
        System.out.println("r = " + r);
        boolean r2 = names.contains("fatih");//true
        System.out.println("r2 = " + r2);

        boolean r3 = numbers.contains(40);
        System.out.println("r3 = " + r3);
        System.out.println("-------------------------------------");


        //equals() method --> checks if 2 ArrayLists are completely same or not (same elements and same order)
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);

        System.out.println(list1 == list2);//since they are different objects it returns false

        boolean r4 = list1.equals(list2);
        System.out.println("r4 = " + r4);
        System.out.println("-------------------------------------");

        //isEmpty() method --> checks if the size is zero or not
        boolean r5 = list1.isEmpty(); //false
        System.out.println("r5 = " + r5);
        list1.clear();
        boolean r6 = list1.isEmpty(); //true
        System.out.println("r6 = " + r6);






    }

}
