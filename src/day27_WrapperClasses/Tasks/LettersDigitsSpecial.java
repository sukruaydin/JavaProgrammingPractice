package day27_WrapperClasses.Tasks;

public class LettersDigitsSpecial {

    public static void main(String[] args) {

        String s = "?Woo9den8Spo,on&";

        char[] arr = s.toCharArray();

        String letters = "";
        String digits = "";
        String special = "";

        for (char each : arr) {
            if (Character.isLetter(each)){
                letters += each;
            } else if (Character.isDigit(each)) {
                digits += each;
            }else {
                special += each;
            }
        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

    }

}
