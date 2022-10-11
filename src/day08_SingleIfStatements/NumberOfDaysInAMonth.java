package day08_SingleIfStatements;

public class NumberOfDaysInAMonth {

    public static void main(String[] args) {
        //print the number of days of given number of month
        int number = 3;
        boolean a = number == 2;
        boolean b = number == 4 || number == 6 || number == 9 || number == 11;
        boolean c = !a && !b;
        if (a){
            System.out.println("29 days");
        }
        if (b){
            System.out.println("30 days");
        }
        if (c){
            System.out.println("31 days");
        }

    }

}
