package day09_IfElseAndMultiBranchIfs.IfAndElse;

public class LeapYear {

    public static void main(String[] args) {
        // find the year is Leap or Not by using if…else statement
        int year = 2020;
        if(year % 4 == 0){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }


    }

}
