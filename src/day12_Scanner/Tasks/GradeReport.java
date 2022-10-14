package day12_Scanner.Tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your score : ");
        int scr = scan.nextInt();
        System.out.println("your score is : " + scr);

        String result = "";
        if(scr >= 0 && scr <= 100){

            result = (scr>=90&&scr<=100)? "A" :(scr>=80&&scr<=90)? "B" :(scr>=70&&scr<=80)? "C" :(scr>=60&&scr<=50)? "D":"F";

        }else{
            result = "invalid score";
        }
        System.out.println("your grade is : " + result);

    }
}
