package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<>();
        family.addAll(Arrays.asList("şükrü","hale","bekir","hülya"));
        System.out.println("family = " + family);

        String[] arr = family.toArray(new String[0]);
        System.out.println("arr = " + Arrays.toString(arr));

    }

}
