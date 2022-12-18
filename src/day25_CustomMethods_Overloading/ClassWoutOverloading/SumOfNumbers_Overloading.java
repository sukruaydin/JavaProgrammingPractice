package day25_CustomMethods_Overloading.ClassWoutOverloading;

public class SumOfNumbers_Overloading {

    public static void main(String[] args) {

        int sum2Numbers = sumOf2Numbers(10,20);
        System.out.println("sum2Numbers = " + sum2Numbers);

        int sum3Numbers = sumOf3Numbers(10,20,30);
        System.out.println("sum3Numbers = " + sum3Numbers);

        int sum4Numbers = sumOf4Numbers(10,20,30,40);
        System.out.println("sum4Numbers = " + sum4Numbers);

    }

    public static int sumOf2Numbers(int num1, int num2){

        return num1+num2;

    }
    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3;

    }
    public static int sumOf4Numbers(int num1, int num2, int num3,int num4){

        return num1+num2+num3+num4;

    }
}
