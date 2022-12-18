package day17_WhileDoWhileBranching.BranchingStatements;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = scan.next();


        String result = "";
        for (int i = 0; i <= s.length()-1; i++){
            if (result.contains(""+s.charAt(i))){
                continue;
            }
            result += s.charAt(i);
        }
        System.out.println("result = " + result);


    }
}
