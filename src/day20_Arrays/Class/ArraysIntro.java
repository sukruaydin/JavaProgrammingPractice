package day20_Arrays.Class;


import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {
        //create a variable that is capable enough to contain 5 names
        //if you are going to specify values later
        String[] name = new String[5];
        name[0] = "şükrü";
        name[1] = "yusuf";
        name[2] = "ömer";
        name[3] = "samet";
        name[4] = "mustafa";
        System.out.println(Arrays.toString(name));

        System.out.println("---------------------------------------------");

        //if you know the variables in advance
        //days of the week
        String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        System.out.println(Arrays.toString(days));

        int number = 5; //5th day of the week
        if (number < 1 || number > 7){
            System.err.println("invalid entry");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("---------------------------------------------");

        //months of the year
        String[] months = {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
        System.out.println(Arrays.toString(months));

        int number2 = 7;
        if (number2 < 1 || number2 > 12){
            System.err.println("invalid entry");
            System.exit(0);
        }
        System.out.println(months[number2-1]);


    }
}
