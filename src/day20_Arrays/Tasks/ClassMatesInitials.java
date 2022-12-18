package day20_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ClassMatesInitials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("enter the "+(i+1)+" st/nd name");
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));

        String initials = "";
        for (int i = 0; i < names.length; i++) {
            initials += names[i].substring(0,1).toUpperCase() + names[i].substring(names[i].indexOf(" ")+1, names[i].indexOf(" ")+2).toUpperCase() + ", ";
        }
        System.out.println(initials.substring(0,initials.length()-2));

    }
}
