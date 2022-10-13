package day10_NestedIfAndTernaries.Ternaries;

public class TernariesIntro {

    public static void main(String[] args) {
        /*
        as long as the result of if statements are same data type, you can use ternaries
        otherwise not
        if(condition) :   (condition) ?
        else          :    :
        else if       :    : (condition) ?
        parenthesis are optional in ternaries
         */
        //number is odd or even, if&else with ternaries
        int number = 101;
        String result = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println("result = " + result);
        System.out.println("-----------------------------------------");

        //eligible to buy alcohol, if&else with ternaries
        int age2 = 55;
        boolean hasID = true;
        String result3 = (age2 >= 21 && hasID) ? "eligible" : "NOT eligible";
        System.out.println("result3 = " + result3);
        System.out.println("-----------------------------------------");

        //negative, positive, or zero, else if with ternaries
        int number2 = 0;
        String result5 = (number2 > 0) ? "positive" : (number2 < 0) ? "negative" : "zero";
        System.out.println("result5 = " + result5);
        System.out.println("-----------------------------------------");

        //eligible to buy alcohol, nested if with ternaries
        int age3 = 48;
        boolean hasID2 = true;
        String result4 = (hasID2) ? ((age3 >= 21) ? "eligible" : "not eligible") : "not eligible";
        System.out.println("result4 = " + result4);
        System.out.println("-----------------------------------------");



    }
}
