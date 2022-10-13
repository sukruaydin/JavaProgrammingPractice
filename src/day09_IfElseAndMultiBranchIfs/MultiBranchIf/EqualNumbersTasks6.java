package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class EqualNumbersTasks6 {

    public static void main(String[] args) {
        //equality of three given numbers
        int n1 = 5;
        int n2 = 9;
        int n3 = 5;
        String equality;

        if (n1 == n2 && n2 == n3){
            equality = "all equal";
        } else if (n1 == n2) {
            equality = "n1 is equal to n2";
        }else if (n1 == n3) {
            equality = "n1 is equal to n3";
        }else if (n2 == n3) {
            equality = "n2 is equal to n3";
        }else {
            equality = "none of them are equal";
        }
        System.out.println(equality);

    }

}
