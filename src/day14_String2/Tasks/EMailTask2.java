package day14_String2.Tasks;

import java.util.Scanner;

public class EMailTask2 {

    public static void main(String[] args) {
        // assume that the e-mail address is constructed by person's first and last name
        //with an underscore between them
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your e-mail address:");
        String e = scan.next();

        int underScore = e.indexOf("_");
        int operator = e.indexOf("@");
        int dot = e.lastIndexOf(".");

        String firstName = e.substring(0,underScore);
        String firstLetter = firstName.substring(0,1).toUpperCase();
        firstName = firstLetter + firstName.substring(1);

        String lastName = e.substring(underScore+1, operator);
        String firstLetter2 = lastName.substring(0,1).toUpperCase();
        lastName = firstLetter2 + lastName.substring(1);

        String domain = e.substring(operator+1, dot);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);


    }
}
