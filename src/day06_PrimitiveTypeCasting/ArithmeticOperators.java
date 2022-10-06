package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 30); //130 addition
        System.out.println(100 - 40); //60 subtraction
        System.out.println(30 * 3);   //90 multiplication
        System.out.println(30 * 3.0); //90.0 multiplication

        System.out.println("100" + 1); //101 concatenation

        System.out.println(10 / 4); // 2 cuz numbers in integers
        System.out.println((double) 10 / 4); //2.5, cuz you cast the result to double
        System.out.println(10.0 / 4); //2.5
        System.out.println(10 / 4.0); //2.5
        System.out.println(10d / 4); //2.5
        System.out.println(10 / 4d); //2.5
        System.out.println("--------------------------");


        int num1 = 100;
        double num2 = num1 / 3; //expecting 33.0, two of them is integer
        System.out.println("num2 = " + num2);

        double num3 = num1 / 3.0; //expecting 33.33333, cuz one of them is decimal
        System.out.println("num3 = " + num3);

        double num4 = num1 / 3d; // cuz one of them is decimal
        System.out.println("num4 = " + num4);

        double num5 = (double)num1 / 3; // cuz one of them ,d decimal
        System.out.println("num5 = " + num5);


    }

}
