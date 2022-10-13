package day11_SwitchCase.Class;

public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        int number = 2;
        int year = 2000;
        String result;

        switch (number){

            case 2:
                /*if(year % 4 == 0) {
                    result = "29 days";
                }else {
                    result = "28 days";
                }*/
                result = (year % 4 == 0) ? "29 days" : "28 days";
                break;

            case 4: case 6: case 9: case 11:
                result = "30 days";
                break;

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                result = "31 days";
                break;

            default:
                result = "invalid number";

        }
        System.out.println("result = " + result);


    }
}
