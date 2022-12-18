package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your full name:");
        String name = scan.nextLine();

        System.out.println("enter your gender: male/female");
        String gender = scan.next().toLowerCase();
        while (!(gender.equals("male") || gender.equals("female"))){
            System.out.println("invalid gender info given, please re-enter");
            System.out.println("enter your gender: male/female");
            gender = scan.next().toLowerCase();
        }

        System.out.println("are you married? yes/no");
        String married = scan.next().toLowerCase();
        while (!(married.equals("yes") || married.equals("no"))){
            System.out.println("invalid married info given, please re-enter");
            System.out.println("are you married? yes/no");
            married = scan.next().toLowerCase();
        }

        System.out.println("how old are you?");
        int age = scan.nextInt();
        while (!(age > 0 && age <= 120)){
            System.out.println("invalid age info given, please re-enter");
            System.out.println("how old are you?");
            age = scan.nextInt();
        }

        System.out.println("how many miles do you drive in a day?");
        int miles = scan.nextInt();
        while (!(miles > 5)){
            System.out.println("invalid mile info given, please re-enter");
            System.out.println("how many miles do you drive ina day?");
            miles = scan.nextInt();
        }

        System.out.println("which one would you prefer : liability / full coverage");
        scan.nextLine();
        String type = scan.nextLine().toLowerCase();
        while (!(type.equals("liability") || type.equals("full coverage"))){
            System.out.println("invalid insurance type given, please re-enter ");
            System.out.println("which one would you prefer : liability / full coverage");
            type = scan.nextLine().toLowerCase();
        }

        System.out.println("have you had any accidents in the last 5 years? yes/no");
        String accident = scan.next().toLowerCase();
        while (!(accident.equals("yes") || accident.equals("no"))){
            System.out.println("invalid accident info given, please re-enter");
            System.out.println("have you had any accidents in the last 5 years?");
            accident = scan.next().toLowerCase();
        }

        System.out.println("does your car have anti-theft device? yes/no");
        String device = scan.next().toLowerCase();
        while (!(device.equals("yes") || device.equals("no"))){
            System.out.println("invalid anti-theft device info given, please re-enter");
            System.out.println("does your car have anti-theft device? yes/no");
            device = scan.next().toLowerCase();
        }


        double cost = 0;
        if (type.equals("liability")){

            cost = (age < 25) ? 90 : 50;
            cost += (miles <= 10) ? 10 :(miles > 10 && miles <= 50) ? 30 : 50;


        } else if (type.equals("full coverage")) {
            cost = (age < 25) ? 160 : 120;
            cost += (miles <= 10) ? 20 :(miles > 10 && miles <= 50) ? 40 : 70;
        }

        cost -= (device.equals("yes")) ? cost*0.05 : 0;
        cost = (accident.equals("yes")) ? (cost+cost*0.15) : (cost-cost*0.10);
        cost -= (married.equals("yes")) ? cost*0.05 : 0;

        System.out.println("cost = " + cost);




    }
}
