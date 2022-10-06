package day06_PrimitiveTypeCasting;

public class Castings {

    public static void main(String[] args) {

        float averageScore = 20.5F;
        byte num1 = (byte) averageScore;
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        long num4= (long) averageScore;
        float num5 = averageScore;
        double num6 = averageScore;

        int num7 = (short) averageScore; // either int or smaller data type it must be

        System.out.println();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);



    }

}
