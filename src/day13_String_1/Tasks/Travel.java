package day13_String_1.Tasks;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("do you have a valid passport ? (yes or no):");
        String passPort = scan.next();

        double costAmount = 0;
        String country = "";
        String result = "";
        if (passPort.equals("yes")){

            costAmount = 1000;

            System.out.println("where do you want to travel:");
            scan.nextLine();
            country = scan.nextLine();

            System.out.println("how many bags do you have with you:");
            byte bags = scan.nextByte();
            costAmount += bags * 50;

            System.out.println("how many people you are traveling with?:");
            short howManyPeople = scan.nextShort();
            if (howManyPeople >=0 && howManyPeople < 3){
                costAmount = (howManyPeople==0) ? costAmount :(howManyPeople==1)? (costAmount-100) : (costAmount-200);

            }else {
                costAmount -= 300;
            }

            System.out.println("Enter the name of the people you are traveling with in one line, " +
                    "separating each name with a comma:");
            scan.nextLine();
            String peopleYouTravelWith = scan.nextLine();

            result = "Your ticket is booked to " + country + ". We have charged extra for the "+ bags+ " bags " +
                    "but you are traveling with "+ peopleYouTravelWith+ " so we are giving a discount. Your total " +
                    "cost is " + costAmount;

        } else if (passPort.equals("no")) {

            costAmount = 200;

            System.out.println("which year your passport was expired?:");
            int expiredYear = scan.nextInt();
            costAmount += (2022-expiredYear) * 75;

            System.out.println("which country do you plan to travel:");
            scan.nextLine();
            country = scan.nextLine();

            System.out.println("are you planing to travel next year ? (yes or no)");
            String yesOrNo = scan.next();
            if (yesOrNo.equals("yes")){
                costAmount += 100;
            }else {
                costAmount -= 50;
            }
            result = "Looks like your passport has been expired for " + (2022-expiredYear) + " years, but not to " +
                    "worry we will get it ready for you to travel to all countries. Your total cost " +
                    "has come out to " + costAmount;

        }else {
            result ="invalid information given";
        }
        System.out.println(result);

    }
}
