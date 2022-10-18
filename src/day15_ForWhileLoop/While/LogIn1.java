package day15_ForWhileLoop.While;

import java.util.Scanner;

public class LogIn1 {

    public static void main(String[] args) {

        //username: "User"
        //password: "User123"
        //3 attempts are allowed

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username:");
        String u = scan.next();
        System.out.println("enter your password:");
        String p = scan.next();

        int count = 2;
        while (!(u.equals("User") && p.equals("User123"))){
            if (count > 0){
                System.out.println("invalid data given, please re-enter " + count +" times you have right to punch the code");
                System.out.println("enter your username:");
                u = scan.next();
                System.out.println("enter your password:");
                p = scan.next();
                count--;
            }else{
                System.out.println("locked");
                break;
            }
        }
        if ((u.equals("User") && p.equals("User123"))){
            System.out.println("logged in");
        }


    }
}
