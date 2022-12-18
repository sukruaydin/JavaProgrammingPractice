package day30_CustomClass.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        /*Collections.swap(list1,0,list1.size()-1);
        System.out.println("list1 = " + list1);*/

        int temp = list1.get(0);
        list1.set(0,list1.get(list1.size()-1));
        list1.set(list1.size()-1,temp);

        System.out.println("list1 = " + list1);

    }

}
