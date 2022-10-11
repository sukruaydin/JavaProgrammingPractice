package day08_SingleIfStatements;

public class MedianNumber {

    public static void main(String[] args) {
        //find the median number between 3 different numbers
        int num1 = 250;
        int num2 = 200;
        int num3 = 225;
        if (num1 > num2 && num1 < num3 || num1 < num2 && num1 > num3) {
            System.out.println(num1 + " is median number");
        }
        if (num2 > num1 && num2 < num3 || num2 < num1 && num2 > num3) {
            System.out.println(num2 + " is median number");
        }

        if (num3 > num1 && num3 < num2 || num3 < num1 && num3 > num2) {
            System.out.println(num3 + " is median number");
        }
    }

}
