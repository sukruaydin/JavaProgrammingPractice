package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class LogInForLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter you username:");
        String u = scan.next();
        System.out.println("enter your password:");
        String p = scan.next();

        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("logged in");
        }else {
            for (int i = 2; i >= 1; i--) {
                System.out.println("invalid username or password given, please re-enter");
                System.out.println(i + " times left");
                System.out.println("enter you username:");
                u = scan.next();
                System.out.println("enter your password:");
                p = scan.next();
                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                    System.out.println("logged in");
                    break;
                } else if (i == 1) {
                    System.out.println("locked");
                }
            }

        }

scan.close();


    }
}
