package day18_NestedLoop.Class;

import java.util.Scanner;

public class AdditionalTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     while (true)  {
         System.out.println("enter number1:");
         int n1 = scan.nextInt();
         System.out.println("enter number2:");
         int n2 = scan.nextInt();

         System.out.println("addition: " + (n1+n2));
         System.out.println("would you like to continue?");
         String a = scan.next().toLowerCase();

         while(!(a.equals("yes") || a.equals("no"))){
             System.out.println("invalid answer given, please re-enter");
             System.out.println("would you like to continue?");
             a = scan.next().toLowerCase();
         }
         if(a.equals("no")){
             break;
         }
     }
    }
}
