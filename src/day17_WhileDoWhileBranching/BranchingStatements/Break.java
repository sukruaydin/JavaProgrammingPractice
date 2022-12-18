package day17_WhileDoWhileBranching.BranchingStatements;

import java.util.Scanner;

public class Break {

    public static void main(String[] args) {
        //forcefully exits the loop
        for (char i = 'A'; i < 'Z'; i++){
            if (i == 'F'){   //F is not included
                break;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("enter positive number:");
            int n = scan.nextInt();
            if(n < 0){
                break;
            }
            System.out.println(n+" ");

        }
    }
}
