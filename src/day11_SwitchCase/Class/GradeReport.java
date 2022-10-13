package day11_SwitchCase.Class;

public class GradeReport {

    public static void main(String[] args) {

        char grade = 'X';
        String result;

        switch (grade){

            case 'A':
                result = "excellent";
                break;

            case 'B':
                result = "great";
                break;

            case 'C':
                result = "good";
                break;

            case 'D':
                result = "passed";
                break;

            case 'F':
                result = "failed";
                break;

            default:
                result = "invalid grade";

        }
        System.out.println("result = " + result);

    }

}
