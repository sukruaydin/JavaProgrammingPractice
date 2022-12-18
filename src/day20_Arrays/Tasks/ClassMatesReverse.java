package day20_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ClassMatesReverse {

    public static void main(String[] args) {
        //reverse names
        Scanner scan = new Scanner(System.in);

        String[] names = new String[2];

        for (int i = 0; i < names.length; i++) {
            System.out.println("enter the "+(i+1)+" st/nd name");
            names[i] = scan.next();
        }
        System.out.println(Arrays.toString(names));

        String result = "";
        for (int i = 0; i < names.length; i++) {
            for (int j =names[i].length()-1; j >= 0; j--){
                result = ""+names[i].charAt(j);
                System.out.print(result);
            }
            System.out.println();
        }

    }
}
