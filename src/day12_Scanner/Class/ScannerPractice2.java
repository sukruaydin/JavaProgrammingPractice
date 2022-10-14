package day12_Scanner.Class;

import java.util.Scanner;

public class ScannerPractice2 {


    public static void main(String[] args) {
        //next.Boolean(); METHOD
        Scanner scan = new Scanner(System.in);
        System.out.println("are you married? \nTrue or False");
        boolean isMarried = scan.nextBoolean();
        System.out.println("you are married : " + isMarried);

        //next.(); METHOD
        //only reads until the space, means just A WORD
        System.out.println("enter your name : ");
        String name = scan.next();
        System.out.println("your name is : " + name);

        //next.Line(); METHOD
        //only reads until pressing enter key
        scan.nextLine(); // ==> this captures the ENTER key in the scanner's memory
        //after any scanner function other than nextLine ==>
        // we have to write an extra "scan.nextLine();" before using "scan.nextLine();"
        //why? suppose that we didn't write that extra one ==> once we hit the enter key after
        //texting your name, age or sth else by using methods like ==> next(), nextInt() ..
        //"pressing enter" is kept in scanner's memory ==>
        //and it gets executed in the next scanner function
        //so, it doesn't let you write your input by finishing the process
        //methods other than nextLine can't read "ENTER" key

        System.out.println("enter your full name : ");
        String fullName = scan.nextLine();
        System.out.println("your full name : " + fullName);

        //but, we can directly use nextLine after a nextLine
        //cuz in the first nextLine, your enter key is read by it
        System.out.println("enter you mobile phone brand with the model : ");
        String phone = scan.nextLine();
        System.out.println("you mobile phone : " + phone);

        scan.close();
    }
}
