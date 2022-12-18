package day26_CustomMethodsPractice.Tasks;

public class MaxNumber {

    public static void main(String[] args) {

        System.out.println(maxNumberOf2(5,33));

    }

    //checks the max number, returns int
    public static int maxNumberOf2(int num1, int num2){

        return  (num1 > num2)? num1 : num2;
    }
    //checks the max number, returns double
    public static double maxNumberOf2(double num1, double num2){

        return  (num1 > num2)? num1 : num2;
    }


}
