package day27_WrapperClasses.Class;

public class WrapperClassesPractice {

    public static void main(String[] args) {

        //find the sum of the digits
        String s = "şü66krü123ay5dı8n";

        char[] arr = s.toCharArray();

        int sum = 0;
        for (char each : arr) {
            if(Character.isDigit(each)){
                int i = Integer.parseInt(each+"");
                sum += i;
            }
        }
        System.out.println(sum);

    }
}
