package day10_NestedIfAndTernaries.Tasks;

public class GradeNumber {


    public static void main(String[] args) {
        //g,grade given A,B,C,D,E,F only -> upper cases
        char g = 'B';
        String result;

        if(g >= 'A' && g <= 'F'){

            if (g == 'A'){
                result = "excellent";
            } else if (g == 'B') {
                result = "great";
            }else if (g == 'C') {
                result = "good";
            }else if (g == 'D') {
                result = "passed";
            }else {
                result = "failed";
            }

        }else{
            result = "invalid grade";
        }
        System.out.println("result = " + result);
    }

}
