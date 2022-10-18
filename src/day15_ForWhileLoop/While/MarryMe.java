package day15_ForWhileLoop.While;

import java.util.Scanner;

public class MarryMe {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("will you marry me?");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes") || a.equals("no"))){
            System.out.println("invalid answer, please re-enter:");
            System.out.println("will you marry me?");
            a = scan.next().toLowerCase();
        }

        if (a.equals("yes")){
            System.out.println("CONGRATSSSS");
        }else{
            System.out.println("SAD STORYYY");
        }

    }
}
