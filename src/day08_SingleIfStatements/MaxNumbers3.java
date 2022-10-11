package day08_SingleIfStatements;

public class MaxNumbers3 {

    public static void main(String[] args) {

        // determine max numbers between 2 numbers
        int num1 = 26;
        int num2 = 25;
        boolean a = num1 > num2;
        boolean b = num1 < num2;
        boolean c = num1 == num2;

        if(a){
            System.out.println(num1 + " is maximum number");
        }
        if(b){
            System.out.println(num2 + " is maximum number");
        }
        if(c){
            System.out.println(num1 + " is equal to " + num2);
        }

    }

}
