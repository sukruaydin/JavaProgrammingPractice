package day06_PrimitiveTypeCasting;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        //implicit casting
        byte num1 = 100;
        short num2 = num1;
        int num3 = num2;
        long num4 = num3;
        float num5 = num4;
        double num6 = num5;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println();


        //explicit casting

        short num7 = 10;
        byte num8 = (byte)num7;
        double num9 = 2.5;
        float num10 = (float)num9;
        double num11 = 10.8;
        int num12 = (int)num11;

        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);
        System.out.println("num9 = " + num9);
        System.out.println("num10 = " + num10);
        System.out.println("num11 = " + num11);
        System.out.println("num12 = " + num12);

        //shortcut alt + enter, or by clicking the solution bulb

        double num13 = 12.5;
        int num14 = (int) num13;

        System.out.println("num13 = " + num13);
        System.out.println("num14 = " + num14);



    }

}
