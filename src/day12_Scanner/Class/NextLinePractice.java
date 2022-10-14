package day12_Scanner.Class;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your age : ");
        int age = scan.nextInt();

        System.out.println("enter your full name : ");
        scan.nextLine();
        String fullName = scan.nextLine();

        System.out.println("enter your gpa : ");
        double gpa = scan.nextDouble();

        System.out.println("enter your school name : ");
        scan.nextLine();
        String schoolName = scan.nextLine();

        System.out.println("enter your father name :");
        String fatherName = scan.next();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        System.out.println("fatherName = " + fatherName);

        scan.close();

    }

}
