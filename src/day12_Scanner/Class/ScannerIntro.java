package day12_Scanner.Class;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //the line above ==> is the Scanner declaration
        //scan ==> is a variable name, also can be scan
        //new Scanner(System.in) ==> is the object
        //Scanner ==> is the constructor
        //(System.in) ==> is one of the functions(arguments) that scanner has, to get an input

        System.out.println("type an integer number : ");
        int num1 = scan.nextInt(); //Basically, this is the method ==> I'm calling nextInt() from System.in
        //I could have written like this without declaring a variable ==> new Scanner(System.in).nextInt();
        // ==> but, this would be only for 1 usage
        System.out.println("the number typed : " + num1);


        System.out.println("----------------------------------------------");

        System.out.println("type a decimal number : ");
        double num2 = scan.nextDouble();
        System.out.println("the number typed : " + num2);

        System.out.println("----------------------------------------------");

        System.out.println("multiplication : " + (num1 * num2));

        scan.close();  //once this close method gets executed, scanner will be terminated
        //just a recommendation not to make your compiler occupied
        //give this method once you are %100 sure not to use scanner again
        //you can not use scanner anymore after this line

    }

}
