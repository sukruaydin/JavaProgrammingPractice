package day19_RecapLoopString.Tasks;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("enter your score");
            int s = scan.nextInt();
            if (s < 0 || s > 100){
                System.err.println("invalid entry");
                System.exit(0);
            }

            String result = (s<=100 && s>=90)? "A" :(s<=89 && s>=80)? "B" :(s<=79 && s>=70)? "C" :(s<=69 && s>=60)? "D" : "F";
            System.out.println("result = " + result);

            System.out.println("would you like to continue");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer give, please re-enter");
                System.out.println("would you like to continue");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }


    }
}
