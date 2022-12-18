package day28_ArrayList.Tasks;

import java.util.ArrayList;

public class CombineIntoArrayList {

    public static void main(String[] args) {

        String[] s1 = {"ali","alper","bahadır"};
        String[] s2 = {"şükrü","hamza"};

        ArrayList<String> names = new ArrayList<>();

        for (String each : s1) {
            names.add(each);
        }

        for (String each : s2) {
            names.add(each);
        }

        System.out.println("names = " + names);

    }

}
