package day19_RecapLoopString.Class;

import java.util.Scanner;

public class ExitExampleCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        while (true){
            System.out.println("enter first number");
            int n1 = scan.nextInt();
            System.out.println("provide the math operator");
            char c = scan.next().charAt(0);

            if (!(c == '+' || c == '-' || c == '*' || c == '/')){
                System.err.println("invalid math operator");
                System.exit(0);
            }

            System.out.println("enter second number");
            int n2 = scan.nextInt();

            result = (c=='+')? n1+n2 :(c=='-')? n1-n2 :(c=='*')? n1*n2 : n1/n2;
            System.out.println("result = " + result);
            System.out.println("would you like to repeat? yes/no");
            String a = scan.next().toLowerCase();

            if (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid entry");
                System.exit(0);
            }
            if (a.equals("no")){
                System.out.println("thanks for using calculator");
                break;
            }
        }



    }

}
