package day07_Operators;

public class LogicalOperators {

    public static void main(String[] args) {

        // && AND operator, is eligible to vote in the USA (both)
        String name = "Steven";
        int age = 17;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is eligible to vote = " + isEligible);

        //eligible for loan, creditScore >=700, age2 >=21, income >= 60_000$
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 28;
        int income = 65_000;
        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 60_000;
        System.out.println(name2 + " is eligible for loan = " + isEligible2);
        System.out.println("-----------------------------------------------");


        // || OR operator (either), is eligible for Selective Service (asker alma gibi)
        // age >=18, doesn't matter M or F
        String name3 = "Victoria";
        int age3 = 22;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is  eligible for Selective Service = " + isEligible3);
        //eligible to apply USA citizenship, either being married to a USA citizen or born in USA
        String name4 = "Şükrü";
        String birthPlace = "Türkiye";
        boolean marriedToUSACitizen = false;
        boolean isEligible4 = birthPlace == "USA" || marriedToUSACitizen == true;
        System.out.println(name4 + " is eligible to apply USA citizenship = " + isEligible4);
        System.out.println("-----------------------------------------------");

        // ! NOT operator
        int scoreOfExam = 50;
        boolean passed = scoreOfExam >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }

}
