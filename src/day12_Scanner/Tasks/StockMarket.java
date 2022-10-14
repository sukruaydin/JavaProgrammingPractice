package day12_Scanner.Tasks;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many total shares you have already :");
        int shares = scan.nextInt();

        System.out.println("how much your total value in the stock market :");
        double totalValue = scan.nextDouble();

        System.out.println("enter the name of the company you have the most shares :");
        scan.nextLine();
        String companyName = scan.nextLine();

        String result ="";
        if (shares > 0){
            result = "Your total stock market holding is $" + totalValue + " which is made up of " + shares + " shares. "
                    + companyName + " is your company holdings";
        }else{
            result = "invalid number given";
        }
        System.out.println(result);
    }

}
