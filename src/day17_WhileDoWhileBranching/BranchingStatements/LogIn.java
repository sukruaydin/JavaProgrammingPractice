package day17_WhileDoWhileBranching.BranchingStatements;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter username:");
        String u = scan.next();
        System.out.println("enter password");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("logged in");
        }else{
            for (int i = 2; i > 0; i--){
                System.out.println("invalid username or password, "+i + " attempts left");
                System.out.println("enter username:");
                u = scan.next();
                System.out.println("enter password");
                p = scan.next();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("logged in");
                    break;
                }
                if (i == 1) {
                    System.out.println("locked");
                }
            }

        }
    }
}
