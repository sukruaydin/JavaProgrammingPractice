package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class PosNegZero {

    public static void main(String[] args) {
        //define the given number as positive, negative, or zero
        int number = -5;
        if (number > 0){
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        }else {
            System.out.println(number + " is zero");
        }


    }
}
