package day29_ArrayList_Continue.Class;

import java.util.ArrayList;

public class FirstUnique {

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

        for (int i = 0; i < names.size(); i++) {
            int count = 0;
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(names.get(i));
                break;
            }
        }


    }

}
