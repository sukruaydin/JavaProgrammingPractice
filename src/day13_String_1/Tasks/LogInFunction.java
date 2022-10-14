package day13_String_1.Tasks;

import java.util.Scanner;

public class LogInFunction {

    public static void main(String[] args) {
        //assume that username: Cydeo, password:WoodenSpoon
        Scanner scan = new Scanner(System.in);

        System.out.println("enter you username:");
        String userName = scan.next();

        System.out.println("enter you password:");
        String passWord = scan.next();

        String result = "";
        if (userName.equals("Cydeo") && passWord.equals("WoodenSpoon")){
            result = "Logged-in";
        }else {
            result = "Incorrect username or password";
        }
        System.out.println(result);
    }
}
