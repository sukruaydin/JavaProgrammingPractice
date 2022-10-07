package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, <, <=, for boolean using
        // >, >=
        boolean result1 = 100 > 50 ; //true
        System.out.println("result1 = " + result1);
        boolean result2 = 100 >= 100; //true
        System.out.println("result2 = " + result2);
        boolean result3 = 100 >= 120; //false
        System.out.println("result3 = " + result3);
        //credit score of at least 720
        int creditScore = 745;
        boolean isElligibleForLoan = creditScore >= creditScore;
        System.out.println("isElligibleForLoan = " + isElligibleForLoan);
        System.out.println("------------------------------------------------------");

        //<, <=
        boolean result4 = 40 < 50;
        System.out.println("result4 = " + result4);
        boolean result5 = 40 <30;
        System.out.println("result5 = " + result5);

        int score = 55;
        boolean hasFailed = score <= 59;
        System.out.println("hasFailed = " + hasFailed);
        System.out.println("------------------------------------------------------");


        //equal
        int num1 = 22;
        int num2 = 25;
        boolean equal1 = num1 == num2; //false
        System.out.println("equal1 = " + equal1);
        boolean equal2 = 22 == 22; //true
        System.out.println("equal2 = " + equal2);
        boolean equal3 = "Sema" == "GoodGirl"; //ofc false
        System.out.println("equal3 = " + equal3);

        //declaring a char into boolean
        boolean result6 = 'A' == 'a'; //false
        System.out.println("result6 = " + result6);
        System.out.println("------------------------------------------------------");

        //not equal
        boolean result7 = "Şükrü" != "GoodBoy";
        System.out.println("result7 = " + result7);
        boolean result8 = 100 != 100;
        System.out.println("result8 = " + result8);



    }

}
