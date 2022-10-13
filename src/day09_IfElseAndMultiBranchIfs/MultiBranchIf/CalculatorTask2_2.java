package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class CalculatorTask2_2 {

    public static void main(String[] args) {
        //calculate the numbers by given operator
        double n1 = 2;
        double n2 = 100;
        char mathOperator = '*';
        String result;

        if (mathOperator == '+'){
            result ="result = " + (n1 + n2);
        } else if (mathOperator == '-') {
            result = "result = " + (n1 - n2);
        }else if (mathOperator == '*') {
            result = "result = " + (n1 * n2);
        } else if (mathOperator == '/') {
            result = "result = " + (n1 / n2);
        }else{
            result = "invalid";
        }
        System.out.println(result);

    }
}
