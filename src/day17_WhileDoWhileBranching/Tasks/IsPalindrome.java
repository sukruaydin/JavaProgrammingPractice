package day17_WhileDoWhileBranching.Tasks;

public class IsPalindrome {

    public static void main(String[] args) {

        String s = "anna";
        boolean isPalindrome = isPalindrome(s);
        System.out.println("isPalindrome = " + isPalindrome);

    }

    public static boolean isPalindrome(String str){

        boolean result;
        if (str.equalsIgnoreCase(ReverseString.reversed(str))){
            result = true;
        }else {
            result = false;
        }

        return result;

    }

}
