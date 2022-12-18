package day26_CustomMethodsPractice.Tasks;

public class IsOdd {

    public static void main(String[] args) {

        System.out.println(isOdd(15));

    }

    //checks if given int number is odd, return boolean
    public static boolean isOdd(int num){

        boolean result = false;
        if (num % 2 != 0){
            result = true;
        }

        return result;
    }
}
