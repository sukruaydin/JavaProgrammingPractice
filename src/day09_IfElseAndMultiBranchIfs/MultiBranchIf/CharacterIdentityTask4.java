package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class CharacterIdentityTask4 {

    public static void main(String[] args) {

        char ch = 'z';
        String result;

        if (ch >= 48 && ch <= 57){
            result = "digit";
        } else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
            result = "alphabetic character";
        }else {
            result = "special character";
        }

        System.out.println(result);

    }

}
