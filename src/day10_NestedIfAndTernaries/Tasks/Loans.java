package day10_NestedIfAndTernaries.Tasks;

public class Loans {

    public static void main(String[] args) {

        int salary = 90_000;
        int creditScore = 760;
        String result = (salary > 60_000 && creditScore >650) ? "loan approved" : "loan denied";
        System.out.println("result = " + result);


    }
}
