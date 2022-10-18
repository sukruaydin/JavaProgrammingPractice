package day14_String2.Tasks;

import java.util.Scanner;

public class EMailTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter your e-mail address:");
        String e = scan.next();

        String result = "";
        if(e.indexOf("_") >= 0){

            int underScore = e.indexOf("_");
            int operator = e.indexOf("@");
            result = e.substring(underScore+1, operator) + "_" + e.substring(0, underScore) + e.substring(operator);

        }else {
            result = e;
        }
        System.out.println(result);
    }
}
