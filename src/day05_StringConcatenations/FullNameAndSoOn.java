package day05_StringConcatenations;

public class FullNameAndSoOn {

    public static void main(String[] args) {

        String firstName = "Oğuz";
        String lastName = "The Boss";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Amazon";
        double salary = 100_000.58;


        System.out.println("Full name of the person is " + fullName + ".");
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is a/an " + jobTitle + ", " + "works at " + companyName +
                ", " + fullName + "' salary is $" + salary + ".");



    }


}
