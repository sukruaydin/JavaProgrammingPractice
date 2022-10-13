package day10_NestedIfAndTernaries.Ternaries;

public class DaysInWeek {

    public static void main(String[] args) {
        // days in week, multi-branch if with ternaries
        int n1 = 5;
        String result1 = (n1 == 1) ? "monday" : (n1 == 2) ? "tuesday" : (n1 == 3) ? "wednesday" : (n1 == 4) ? "thursday"
                : (n1 == 5) ? "friday" : (n1 == 6) ? "saturday" : "sunday";
        System.out.println("result1 = " + result1);
        System.out.println("---------------------------------------------");

        // days in week, nested if with ternaries
        int n2 = 8;
        String result2 = (n2 >= 1 && n2 <= 7) ? ((n2 == 1) ? "monday" : (n2 == 2) ? "tuesday" : (n2 == 3) ? "wednesday" : (n2 == 4) ? "thursday"
                : (n2 == 5) ? "friday" : (n2 == 6) ? "saturday" : "sunday") : "invalid number";
        System.out.println("result2 = " + result2);
    }

}
