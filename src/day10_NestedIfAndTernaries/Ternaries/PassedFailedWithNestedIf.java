package day10_NestedIfAndTernaries.Ternaries;

public class PassedFailedWithNestedIf {

    public static void main(String[] args) {
        //passed, failed, or invalid score
        int s = 605;
        String result7 = (s >= 0 && s <= 100) ? ((s >= 60) ? "passed" : "failed") : "invalid score";
        System.out.println("result7 = " + result7);
    }
}
