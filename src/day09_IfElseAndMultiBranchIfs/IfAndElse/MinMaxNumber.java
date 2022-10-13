package day09_IfElseAndMultiBranchIfs.IfAndElse;

public class MinMaxNumber {

    public static void main(String[] args) {
        //find max number between 2 different numbers
        int num1 = 18,
                num2 = 12;
        if(num1 > num2){
            System.out.println(num1 + " is the max number");
        }else{
            System.out.println(num2 + " is the max number");
        }

        int num3 = 22,
                num4 = 20;
        if (num3 < num4){
            System.out.println(num3 + " is the min number");
        }else{
            System.out.println(num4 + " is the min number");
        }


    }

}
