package day12_Scanner.Class;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        //next.Int(); METHOD
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number 1~7 : ");
        int num = scan.nextInt();

        String result = "";
        if (num >=1 && num <= 7){
            result = (num==1)?"mon":(num==2)?"tue":(num==3)?"wed":(num==4)?"thu":(num==5)?"fri":(num==6)?"sat":"sun";
        }else {
            result = "invalid input";
        }
        System.out.println("the day is : " + result);
        scan.close();
    }
}
