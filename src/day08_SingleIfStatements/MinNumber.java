package day08_SingleIfStatements;

public class MinNumber {

    public static void main(String[] args) {
        // find min number between 2 numbers
        int num1 = 205;
        int num2 = 200;
        if(num1 < num2){
            System.out.println(num1 + " is min number");
        }
        if (num2 < num1){
            System.out.println(num2 + " is min number");
        }
        if (num1 == num2){
            System.out.println(num1 + " is equal to " + num2);
        }


    }

}
