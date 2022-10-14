package day12_Scanner.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.println("enter the radius of the circle : ");
        double r = scan.nextDouble();
        scan.close();

        double perimeter = 2 * 3.14 * r;
        double area = 3.14 * r * r ;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
