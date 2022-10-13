package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {
        //find the grade by using score 0~100
        char grade;
        int score = 55;
        if (score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        }else{
            grade = 'F';
        }
        System.out.println(grade);

    }

}
