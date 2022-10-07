package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        //unary plus, minus
        int num1 = 100;
        int num2 = +110; //doesn't matter if you use + operator for positive numbers
        int num3 = -90;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("-------------------------------------------");

        //pre-increment, pre-decrement
        int num4 = 12;
        System.out.println("num4 = " + ++num4);; //13, increase the value by 1 right away, then prints
        System.out.println("num4 = " + --num4);; //12, decreases the value by 1 right away, then prints
        System.out.println("-------------------------------------------");

        //post-increment, post-decrement
        int num5 = 56;
        num5++;
        //System.out.println(num5++); //56, prints first then increases the value by 1
        System.out.println("num5 = " + num5);   //57
        int num6 = 45;
        System.out.println("num6 = " + num6--); //45 prints first then decreases the value by 1
        System.out.println("num6 = " + num6);   //44





    }

}
