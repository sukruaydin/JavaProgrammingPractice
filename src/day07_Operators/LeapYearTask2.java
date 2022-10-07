package day07_Operators;

public class LeapYearTask2 {

    public static void main(String[] args) {

        int year = 2020;
        int result = year % 4;
        boolean ifLeapYear = result == 0;
        System.out.println(year + " is leap year = " + ifLeapYear);



    }

}
