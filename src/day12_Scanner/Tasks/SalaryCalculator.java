package day12_Scanner.Tasks;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your hourly rate : ");
        double hourlyRate = scan.nextDouble();

        System.out.println("how many hours do you work in a week : ");
        int hour = scan.nextInt();

        System.out.println("enter the state tax : ");
        double stateTax = scan.nextDouble();

        System.out.println("enter the federal tax : ");
        double federalTax = scan.nextDouble();


        double salary = hourlyRate * hour * 52;
        double totalTax = stateTax + federalTax;
        double netIncome = salary - (totalTax * salary);

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);



    }
}
