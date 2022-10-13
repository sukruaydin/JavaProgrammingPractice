package day10_NestedIfAndTernaries.Tasks;

public class BiggerNumber {

    public static void main(String[] args) {
        // suppose that 3 different numbers
        int n1 = 3,
                n2 = 5,
                n3 = 7;
        String result = (n1 > n2 && n1 > n3) ? "n1 is bigger" : (n2 > n1 && n2 > n3) ? "n2 is bigger" : "n3 is bigger";
        System.out.println("result = " + result);


    }

}
