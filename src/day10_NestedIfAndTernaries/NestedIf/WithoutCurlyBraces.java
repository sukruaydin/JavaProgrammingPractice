package day10_NestedIfAndTernaries.NestedIf;

public class WithoutCurlyBraces {

    public static void main(String[] args) {
        // if you have one statement in the block, you may not use curly braces. but it is not recommended
        int score = 95;
        String result;

        if (score >= 90)
            result = "excellent";
        else if (score >= 80)
            result = "great";
        else if (score >= 70)
            result = "good";
        else if (score >= 60)
            result = "passed";
        else
            result = "failed";

        System.out.println("result = " + result);
    }
}
