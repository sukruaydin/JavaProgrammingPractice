package day12_Scanner.Tasks;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int speedLimit = 50;

        System.out.println("enter your current speed in km/hr : ");
        int speed = scan.nextInt();

        if (speed > 0) {
            if (speed > speedLimit) {
                System.out.println("you are driving " + (speed - speedLimit) + " km/hr over the speed limit, " +
                        "slow down, the ticket is coming as you paid 1000TL before");
            } else {
                System.out.println("your speed is good");
            }
        }else{
            System.out.println("invalid speed");
        }

    }
}
