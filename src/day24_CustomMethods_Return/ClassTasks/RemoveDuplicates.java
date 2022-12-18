package day24_CustomMethods_Return.ClassTasks;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s = "aaaabbcccc";
        String result = removeDuplicates(s);
        System.out.println("result = " + result);

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
