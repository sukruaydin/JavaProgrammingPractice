package day24_CustomMethods_Return.Class;

public class ReturnMehtodPractice {

    public static void main(String[] args) {

        int result = maxNumber(100,200) * 2;
        System.out.println("result = " + result);

    }

    public static int maxNumber(int number1, int number2){

        int max = 0;
        if (number1 > number2){
            max = number1;
        } else if (number2 > number1) {
            max = number2;
        }else {
            max = number1;
        }
        return max;

    }

}
