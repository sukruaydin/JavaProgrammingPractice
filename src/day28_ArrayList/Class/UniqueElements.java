package day28_ArrayList.Class;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        //print out the unique elements into a new ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("ahmet");
        names.add("mehmet");
        names.add("hakan");
        names.add("fatih");
        names.add("hakan");
        System.out.println("names = " + names);

        ArrayList<String> unique = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (names.indexOf(names.get(i)) == names.lastIndexOf(names.get(i))){
                unique.add(names.get(i));
            }
        }

        System.out.println("unique = " + unique);

    }

}
