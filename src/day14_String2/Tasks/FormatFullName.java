package day14_String2.Tasks;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        /*
        input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
         */

        System.out.println("enter fullname:");
        //if you will be using scanner just once ==> you don't need to create a scanner object
        String fullName = new Scanner(System.in).nextLine();
        String firstName = fullName.substring(0,fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

        String firstName1 = (""+ firstName.charAt(0)).toUpperCase();
        String firstName2 = firstName.substring(1).toLowerCase();
        firstName = firstName1 + firstName2;

        String lastName1 = (""+ lastName.charAt(0)).toUpperCase();
        String lastName2 = lastName.substring(1).toLowerCase();
        lastName = lastName1  + lastName2;

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);



    }
}
