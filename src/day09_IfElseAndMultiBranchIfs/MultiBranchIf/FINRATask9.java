package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class FINRATask9 {

    public static void main(String[] args) {
        //print the number, if divisible by 3 -> print FIN, by 5 -> print RA, both -> FINRA
        int number = 7;
        String result1;

        if (number % 3 == 0 && number % 5 == 0){
            result1 = "FINRA";
        } else if (number % 3 == 0) {
            result1 = "FIN";
        } else if (number % 5 == 0) {
            result1 = "RA";
        }else {
            result1 = "number = " + number;
        }
        System.out.println(result1);
    }

}
