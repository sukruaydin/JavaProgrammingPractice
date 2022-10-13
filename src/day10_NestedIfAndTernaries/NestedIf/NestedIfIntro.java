package day10_NestedIfAndTernaries.NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {
        // if passed or failed with the pre-condition whether score is valid or not
        int score = 105;
        String result;

        if (score >= 0 && score <= 100){
            if(score >= 60){
                result = "passed";
            }else {
                result = "failed";
            }

        }else {
            result = "invalid score";

        }
        System.out.println("result = " + result);
        System.out.println("------------------------------------------------------");




        // eligible to buy alcohol age >= 21, with the pre-condition whether having id or not
        int age = 20;
        boolean hasID = true;
        if (hasID){

            if (age >= 21){
                System.out.println("Eligible to buy alcohol");
            }else {
                System.out.println("NOT eligible to buy alcohol");
            }

        }else {
            System.out.println("NOT eligible to buy alcohol");
        }
        System.out.println("------------------------------------------------------");



        // find the name of the day, with the pre-condition number between 1~7
        int number = 0;

        if (number > 0 && number <= 7){

            if (number == 1){
                System.out.println("monday");
            } else if (number == 2) {
                System.out.println("tuesday");
            } else if (number == 3) {
                System.out.println("wednesday");
            } else if (number == 4) {
                System.out.println("thursday");
            } else if (number == 5) {
                System.out.println("friday");
            } else if (number == 6) {
                System.out.println("saturday");
            }else {
                System.out.println("sunday");
            }

        }else {
            System.out.println("invalid number");
        }



    }



}
