package day19_RecapLoopString.Tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("How many dollars make an hour?");
            double d = scan.nextDouble();
            if (d <= 0.0){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            int h = scan.nextInt();
            if (h < 1 || h > 144){
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            double t = scan.nextDouble();
            if (t < 0.0 || t > 0.1){
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            double grossSalary = d * h * 52;
            double federalTax = 0.26;
            double stateTax = t;
            double totalTax = 0.26 +t;
            double netIncome = grossSalary - (totalTax * grossSalary);
            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            scan.nextLine();
            String a = scan.nextLine().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer give, please re-enter");
                System.out.println("Would you like to continue?");
                a = scan.nextLine().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }


    }
}
