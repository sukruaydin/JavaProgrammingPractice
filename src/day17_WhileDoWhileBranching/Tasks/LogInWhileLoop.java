package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class LogInWhileLoop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter you username:");
        String u = scan.next();
        System.out.println("enter your password:");
        String p = scan.next();

        int counter = 2;
        if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("logged in");
        }
        while (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){

            System.out.println("invalid username or password given, please re-enter");
            System.out.println(counter + " times left");
            System.out.println("enter you username:");
            u = scan.next();
            System.out.println("enter your password:");
            p = scan.next();
            counter--;
            if(u.equals("Cydeo") && p.equals("WoodenSpoon")) {
                System.out.println("logged in");
                break;
            }
            if (counter == 0){
                System.out.println("locked");
                break;
            }

        }

    }
}
