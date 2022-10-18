package day14_String2.Tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int cost = 0;

        while(true){
            System.out.println("which bedroom would you like? king bed / queen bed / single bed");
            String bed = scan.nextLine().toLowerCase();
            while (!(bed.equals("king bed") || bed.equals("queen bed") || bed.equals("single bed"))){
                System.err.println("invalid bed type given, please re-enter");
                System.out.println("which bedroom would you like? king bed / queen bed / single bed");
                bed = scan.nextLine().toLowerCase();
            }
            System.out.println("how many night are you going to stay?");
            int nights = scan.nextInt();

            cost += (bed.equals("king bed")) ? (nights*120) :(bed.equals("queen bed")) ? (nights*100) : (nights*80);

            System.out.println("would you like to reserve another room for somebody else?");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.err.println("invalid answer info given, please re-enter");
                System.out.println("would you like to reserve another room?");
                a = scan.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("cost = $" + cost);
                break;
            }
            scan.nextLine();
        }





    }
}
