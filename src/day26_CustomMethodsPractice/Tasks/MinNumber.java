package day26_CustomMethodsPractice.Tasks;

public class MinNumber {

    public static void main(String[] args) {

        System.out.println(minNumberOf2(5,33));

    }
    //checks the min number, returns int
    public static int minNumberOf2(int num1, int num2){

        return  (num1 < num2)? num1 : num2;
    }
    //checks the min number, returns double
    public static double minNumberOf2(double num1, double num2){

        return  (num1 < num2)? num1 : num2;
    }
}
