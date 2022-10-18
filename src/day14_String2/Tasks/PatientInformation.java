package day14_String2.Tasks;

import java.util.Scanner;

public class PatientInformation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\n" + "Please enter your personal information\n" + "Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your Zip Code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work Phone Number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your Personal Number");
        long personalPhoneNumber = scan.nextLong();
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextDouble();
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        String fullName = lastName + ", " + firstName;
        String address = street + ", " + city + ", " + state + " " + zipcode;
        String contact = "work phone number - " + workPhoneNumber + ", " +
                "personal phone number - " + personalPhoneNumber + ", email: " + email;
        System.out.println("Patient personal information\n" + "Full name: " + fullName + "\nAddress: " + address + "\nContacts: " + " " + contact + "\nAge: " + age + "\nHeight: " + height + "\nWeight: " + weight + " pounds" + "\nMarried?: " + isMarried);
    }
}
