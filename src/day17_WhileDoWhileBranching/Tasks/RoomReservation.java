package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to reserve a room: yes/no");
        String a = scan.next().toLowerCase();
        int price = 0;

        while(!(a.equals("yes") || a.equals("no"))){
            System.out.println("invalid answer given, please re-enter:");
            System.out.println("do you want to reserve a room: yes/no");
            a = scan.next().toLowerCase();
        }

        if (a.equals("no")){
            System.out.println("have a nice day");
        }else{
            System.out.println("which type of room you'd prefer?");
            scan.nextLine();
            String roomType = scan.nextLine().toLowerCase();
            while(!(roomType.equals("king bed") || roomType.equals("queen bed") || roomType.equals("single bed"))){
                System.out.println("invalid answer give, please re-enter:");
                System.out.println("which type of room you'd prefer?");
                roomType = scan.nextLine();
            }
            if (roomType.equals("king bed")){
                price = 120;
            } else if (roomType.equals("queen bed")) {
                price = 100;
            }else {
                price = 80;
            }
            System.out.println("roomType = " + roomType);
            System.out.println("price = $" + price);
        }





    }
}
