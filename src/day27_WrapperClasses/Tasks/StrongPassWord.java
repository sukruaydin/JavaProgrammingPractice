package day27_WrapperClasses.Tasks;

public class StrongPassWord {

    public static void main(String[] args) {

        String passWord = "sukru!Aydin88";

        char[] arr = passWord.toCharArray();

        //counting the length
        int length = arr.length;

        //counting upper cases
        int countUpper = 0;
        for (char each : arr) {
            if (Character.isUpperCase(each)){
                countUpper++;
            }
        }

        //counting lower cases
        int countLower = 0;
        for (char each : arr) {
            if (Character.isLowerCase(each)){
                countLower++;
            }
        }

        //counting special characters
        int countSpecial = 0;
        for (char each : arr) {
            if (!(Character.isLetterOrDigit(each))){
                countSpecial++;
            }
        }

        //counting digits
        int countDigit = 0;
        for (char each : arr) {
            if (Character.isDigit(each)){
                countDigit++;
            }
        }

        boolean isStrongPassWord = false;
        if (length>=8 && !passWord.contains(" ") && countLower>=1 && countUpper>=1 && countSpecial>=1 && countDigit>=1){
            isStrongPassWord = true;
        }

        System.out.println("isStrongPassWord = " + isStrongPassWord);

        /*Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1. Password MUST be at least have 8 characters long, and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lower case letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit*/


    }

}
