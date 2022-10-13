package day10_NestedIfAndTernaries.Ternaries;

public class GradeReportWithNestedIf {

    public static void main(String[] args) {

        int s = 950;
        String result = (s >= 0 && s <= 100) ? ((s >= 90) ? "excellent" : (s >= 80) ? "great" : (s >= 70) ? "good"
                : (s >= 60) ? "passed" : "failed") : "invalid score";
        System.out.println("result = " + result);
    }

}
