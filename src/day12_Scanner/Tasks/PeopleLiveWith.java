package day12_Scanner.Tasks;

import java.util.Scanner;

public class PeopleLiveWith {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many people are you living with ? : ");
        int peopleNumber = scan.nextInt();

        String result = "";
        if (peopleNumber >= 0){
            result = (peopleNumber<3)? "Live with less than 3 people" :(peopleNumber>=3&&peopleNumber<=6)?
                    "Live with 3 - 6 people" : "Live with more than 6 people";
        }else{
            result = "given number is invalid";
        }
        System.out.println(result);
    }
}
