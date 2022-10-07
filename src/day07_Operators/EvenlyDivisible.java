package day07_Operators;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 24;
        boolean isDivisibleBy2 = number%2 ==0;
        boolean isDivisibleBy3 = number%3 ==0;
        boolean isDivisibleBy5 = number%5 ==0;
        System.out.println(number + " is divisible by 2 = " + isDivisibleBy2);
        System.out.println(number + " is divisible by 3 = " + isDivisibleBy3);
        System.out.println(number + " is divisible by 5 = " + isDivisibleBy5);
        System.out.println("------------------------------------------------");

        int num2 = 100;
        int denominator = 3;
        boolean isDivisible = num2 % denominator == 0 ;
        System.out.println(num2 + " is divisible by " + denominator + " = " + isDivisible);

    }


}
