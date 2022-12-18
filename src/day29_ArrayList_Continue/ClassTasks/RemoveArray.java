package day29_ArrayList_Continue.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveArray {

    public static void main(String[] args) {

        String[] countryNames = {"Turkey","UnitedStatesOfAmerica","Canada","UnitedArabEmirates","Spain"};
        //this is how to convert Array to an arrayList
        ArrayList<String> names = new ArrayList<>(Arrays.asList(countryNames));
        System.out.println("names = " + names);

        names.removeIf( p -> p.length() > 10);
        System.out.println("names = " + names);

        //this is how to convert arrayList to an Array
        String[] removed = names.toArray(new String[0]);
        System.out.println("removed: " + Arrays.toString(removed));

    }

}
