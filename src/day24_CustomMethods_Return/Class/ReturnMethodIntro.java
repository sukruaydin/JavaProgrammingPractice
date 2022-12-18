package day24_CustomMethods_Return.Class;

public class ReturnMethodIntro {

    public static void main(String[] args) {
        //check the string if it is palindrome by creating a method
        String s = "love";
        if (s.equalsIgnoreCase(reverse(s))){
            System.out.println(s + " is palindrome");
        }else {
            System.out.println(s + " is NOT palindrome");
        }

    }

    public static String reverse(String str){

        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        //we are not using print method in return method
        return result;
    }

}
