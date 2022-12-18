package day29_ArrayList_Continue.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove {

    public static void main(String[] args) {

        //remove all names except Ahmet and David

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Ahmet","Jimmy","Daniel","Aaron","Ahmet","David","Shay"));
        employees.retainAll(Arrays.asList("Ahmet","David"));
        System.out.println("employees = " + employees);
        System.out.println("---------------------------------");

        //remove all elements starting with 'M'
        String[] arr = {"Mary","Monica","Mahrey","Sumeyra","Musti","Hasan","Beril"};

        /*without using arraylist
        String result = "";

        for (String each : arr) {
            if (!each.startsWith("M")){
                result += each+" ";
            }
        }

        result = result.substring(0,result.length()-1);

        String[] removed = result.split(" ");
        System.out.println(Arrays.toString(removed));*/

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        list.removeIf( p -> p.startsWith("M"));

        arr = list.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

    }

}
