package day28_ArrayList.Class;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        //add() method --> has 2 function, both add and insert
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println("numbers = " + numbers);
        numbers.add(2,25); //runs like "insert"
        System.out.println("numbers = " + numbers);
        numbers.add(5,45);
        System.out.println("numbers = " + numbers);
        System.out.println("------------------------------------");


        //size() method --> returns the length of the ArrayList
        System.out.println("size: " + numbers.size());
        int lastIndex = numbers.size()-1;
        System.out.println("------------------------------------");


        //get() method  --> like charAt()
        Integer x = numbers.get(3);
        System.out.println("x = " + x);
        int y = numbers.get(4);
        System.out.println("y = " + y);

        for (int i = 0; i < numbers.size(); i++){
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("------------------------------------");


        //set() method --> like replace()
        ArrayList<String> list = new ArrayList<>();
        list.add("şükrü");
        list.add("hale");
        list.add("hülya");
        list.add("hülya");
        list.add("bekir");
        list.add("aydın");
        System.out.println("list = " + list);
        list.set(0,"şerife");
        System.out.println("list = " + list);
        list.set(4,"ahmet");
        System.out.println("list = " + list);
        System.out.println("------------------------------------");


        //remove() method --> has 2 functions
        //remove(indexNumber), remove(object) -> be carefull with Integers
        list.remove(0);
        System.out.println("list = " + list);

        boolean r1 = list.remove("hülya");//removes the first "hülya"
        System.out.println("list = " + list);

        boolean r2 = list.remove("hülya");
        System.out.println("list = " + list);

        System.out.println("r1 = " + r1);//we are making sure that it is removed by seeing "true" statement
        System.out.println("r2 = " + r2);//we are making sure that it is removed by seeing "true" statement
        System.out.println("------------------------------------");


        //clear() method --> size will be zero
        list.clear();
        System.out.println("list = " + list);
        System.out.println("------------------------------------");





    }

}
