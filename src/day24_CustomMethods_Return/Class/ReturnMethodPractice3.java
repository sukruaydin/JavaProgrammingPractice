package day24_CustomMethods_Return.Class;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {
        //create a method that can return frequency of char
        //then print out the unique chars

        String s = "aabccdeee";
        for (int i = 0; i < s.length(); i++) {
            int result = frequencyOfLetters(s,s.charAt(i));

            if (result == 1){
                System.out.print(s.charAt(i)+" ");
            }
        }

    }

    public static int frequencyOfLetters(String str, char ch){

        int count = 0;

        for (char each : str.toCharArray()) {
            if (each == ch){
                count++;
            }
        }
        return count;
    }

}
