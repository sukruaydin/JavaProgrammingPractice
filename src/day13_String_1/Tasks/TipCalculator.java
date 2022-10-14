package day13_String_1.Tasks;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)?:");
        String split = scan.next();

        System.out.println("Enter the number of people:");
        int number = scan.nextInt();

        System.out.println("Enter the check amount:");
        double amount = scan.nextDouble();

        System.out.println("How was the service quality? (Excellent/Great/Good/Fair/Poor):");
        String quality = scan.next();

        double ratio = (quality.equals("Excellent"))? 0.25 :(quality.equals("Great")) ? 0.20
                :(quality.equals("Good")) ? 0.15 : (quality.equals("Fair")) ? 0.10 : 0.05;


        double totalToPay  = amount + (amount * ratio);

        String result = "";
        if (split.equals("Yes")){
            result = "Number of people entered: "+"&".repeat(number)+"\nTotal to pay: "+totalToPay+ "\nTotal tip: "+(totalToPay-amount)
                    +"\nTotal per person: "+totalToPay/number + "\nTip per person: " + (totalToPay-amount)/number;
        }else {
            result = "Total to pay: "+totalToPay + "\nTotal tip: "+(totalToPay-amount);
        }
        System.out.println(result);
    }
}
