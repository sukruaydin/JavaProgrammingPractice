package day10_NestedIfAndTernaries.Ternaries;

public class CharacterIdentity2 {
    public static void main(String[] args) {

        char c = '|';
        String result = (c >= 97 && c <= 122 || c >= 65 && c <= 90) ? "alphabetic character" : (c >= 48 && c <= 57) ?
                "digit" : "special character";
        System.out.println("result = " + result);



    }
}
