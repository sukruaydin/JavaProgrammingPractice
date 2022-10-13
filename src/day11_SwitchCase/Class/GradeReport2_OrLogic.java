package day11_SwitchCase.Class;

public class GradeReport2_OrLogic {
    public static void main(String[] args) {

        char grade = 'e';
        String result;

        switch (grade){

            case 'A': case 'B': case 'C': case 'D':
                result = "passed";
                break;

            case 'F':
                result = "failed";
                break;

            default:
                result = "invalid score";

        }
        System.out.println("result = " + result);

    }
}
