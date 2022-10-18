package day15_ForWhileLoop.While;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age:"); //valid age 1~120
        int age = scan.nextInt();

        while (!(age>0 && age<120)){
            System.out.println("invalid age, please re-enter");
            System.out.println("enter your age:");
            age = scan.nextInt();
        }

        System.out.println("are you a US citizen?");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))){
            System.out.println("invalid answer, please re-enter");
            System.out.println("are you a US citizen?");
            a = scan.next();
        }

        if (age >= 18 && a.equals("yes")){
            System.out.println("eligible to vote");
        }else{
            System.out.println("NOT eligible to vote");
        }
    }
}
