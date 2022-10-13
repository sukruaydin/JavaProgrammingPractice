package day11_SwitchCase.Class;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 5;
        double n2 = 2;
        char operator = '+';
        String result = "";

        if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){

            switch (operator){

                case '+':
                    result = "n1 + n2 = " + (n1 + n2);
                    break;
                case '-':
                    result = "n1 - n2 = " + (n1 - n2);
                    break;
                case '*':
                    result = "n1 * n2 = " + (n1 * n2);
                    break;
                default:
                    result = "n1 / n2 = " + (n1 / n2);
            }
            System.out.println(result);
        }else {
            System.err.println("invalid operator : " + operator);;
        }


    }
}
