package day25_CustomMethods_Overloading.MethodOverloading;

public class SumOfNumbers_Overloading {

    public static void main(String[] args) {
        int result1 = sumOfNumbers(10,20);
        System.out.println("result1 = " + result1);

        int result2 = sumOfNumbers(10,20,30);
        System.out.println("result2 = " + result2);

        int result3 = sumOfNumbers(10,20,30,40);
        System.out.println("result3 = " + result3);

        double result4 = sumOfNumbers(5.5,2.2);
        System.out.println("result2 = " + result4);

        double result5 = sumOfNumbers(5.5,2.2,1.0);
        System.out.println("result5 = " + result5);

        double result6 = sumOfNumbers(5.5,2.2,1.0,2.3);
        System.out.println("result6 = " + result6);
    }

    public static int sumOfNumbers(int num1, int num2){

        return num1+num2;

    }
    public static double sumOfNumbers(double num1, double num2){

        return num1+num2;

    }
    public static int sumOfNumbers(int num1, int num2, int num3){

        return num1+num2+num3;

    }
    public static double sumOfNumbers(double num1, double num2, double num3){

        return num1+num2+num3;

    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){

        return num1+num2+num3+num4;

    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4){

        return sumOfNumbers(num1, num2, num3)+num4;

    }
}
