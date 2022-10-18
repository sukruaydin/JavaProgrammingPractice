package day15_ForWhileLoop.While;

import java.util.Scanner;

public class LogIn2 {


    public static void main(String[] args) {

        //username: "Cydeo"
        //password: "Cydeo123"
        //3 attempts are allowed

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username:");
        String u = scan.next();
        System.out.println("enter your password:");
        String p = scan.next();



        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("logged in");
        }else {
            int attempts = 2;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) {
                System.out.println("incorrect username or password, please re-enter, " + attempts +" times you have right to punch the code");
                System.out.println("enter your username:");
                u = scan.next();
                System.out.println("enter your password:");
                p = scan.next();
                attempts--;
            }
            if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                System.out.println("logged in");
            }else{
                System.out.println("locked");
            }
        }


        scan.close();
    }
}
