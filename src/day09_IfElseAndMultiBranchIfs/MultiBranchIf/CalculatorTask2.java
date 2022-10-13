package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class CalculatorTask2 {

    public static void main(String[] args) {
        //calculate the numbers by given operator
        double n1 = 5;
        double n2 = 4;
        char mathOperator = '+';
        double result;

        if (mathOperator == '+'){
            result = n1 + n2;
        } else if (mathOperator == '-') {
            result = n1 - n2;
        }else if (mathOperator == '*') {
            result = n1 * n2;
        }else{
            result = n1 /n2;
        }
        System.out.println(result);

    }

}
