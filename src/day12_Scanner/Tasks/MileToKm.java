package day12_Scanner.Tasks;

import java.util.Scanner;

public class MileToKm {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter mile value : ");
        double mile = scan.nextDouble();

        double km = mile * 1.609344;
        System.out.println(mile + " miles equal to " + km + " kilometers");

    }
}
