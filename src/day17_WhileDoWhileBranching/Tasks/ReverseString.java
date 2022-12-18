package day17_WhileDoWhileBranching.Tasks;

public class ReverseString {

    public static void main(String[] args) {

        String s = "şükrü";
        String reversed = reversed(s);
        System.out.println("reversed = " + reversed);

    }

    public static String reversed(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }

}
