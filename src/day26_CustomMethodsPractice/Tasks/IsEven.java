package day26_CustomMethodsPractice.Tasks;

public class IsEven {

    public static void main(String[] args) {

        System.out.println(isEven(10));

    }

    //checks if given int number is even, return boolean
    public static boolean isEven(int num){

        boolean result = false;
        if (num % 2 == 0){
            result = true;
        }

        return result;
    }
}
