package day24_CustomMethods_Return.Class;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String s = "aaaabbccc";
        s = removeDuplicates(s);
        System.out.println(s);

    }

    public static String removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

}
