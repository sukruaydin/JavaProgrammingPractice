package day29_ArrayList_Continue.Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharsString {

    public static void main(String[] args) {

       String s = "asdfgsdfgh";
       String[] arr = s.split("");
       System.out.println(Arrays.toString(arr));


        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("list = " + list);
        String result = "";

        for (String each : list) {
            if (Collections.frequency(list,each) == 1){
                result += each;
            }
        }

        System.out.println("result = " + result);


    }

}
