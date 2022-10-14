package day13_String_1.Class;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {
        //charAt(); method
        Scanner scan = new Scanner(System.in);

        System.out.println("enter you first name:");
        String firstName = scan.next();

        System.out.println("enter you last name:");
        String lastName = scan.next();

        char first = firstName.charAt(0); //this must be char data type
        char last = lastName.charAt(0); ////this must be char data type
        String initials1 = first +"."+ last; //we have to add double quote to make it string variable
        System.out.println(initials1);

        //or we can use following way
        String initials2 = firstName.charAt(0) + "." +lastName.charAt(0);
        System.out.println(initials2);


    }

}
