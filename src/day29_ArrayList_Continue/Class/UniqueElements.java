package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("şükrü");
        names.add("ahmet");
        names.add("mehmet");
        names.add("ömer");
        names.add("yusuf");
        names.add("şükrü");
        names.add("alper");
        names.add("mehmet");
        names.add("şükrü");
        names.add("yusuf");
        System.out.println("names = " + names);

        ArrayList<String> uniqueElements = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            int x = Collections.frequency(names,names.get(i));
            if (x==1){
                uniqueElements.add(names.get(i));
            }
        }

        System.out.println("uniqueElements = " + uniqueElements);

        System.out.println("--------------------------------------------------");

        //second solution, good one
        ArrayList<String> names2 = new ArrayList<>();
        names2.add("şükrü");
        names2.add("ahmet");
        names2.add("mehmet");
        names2.add("ömer");
        names2.add("yusuf");
        names2.add("şükrü");
        names2.add("alper");
        names2.add("mehmet");
        names2.add("şükrü");
        names2.add("yusuf");
        System.out.println("names2 = " + names2);

        ArrayList<String> uniqueElements2 = new ArrayList<>(names2);
        uniqueElements2.removeIf( p -> Collections.frequency(uniqueElements2,p) > 1);
        System.out.println("uniqueElements2 = " + uniqueElements2);



    }

}
