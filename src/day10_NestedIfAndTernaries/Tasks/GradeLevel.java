package day10_NestedIfAndTernaries.Tasks;

public class GradeLevel {

    public static void main(String[] args) {

        byte gradeNumber = 19;
        String school;
        if (gradeNumber >= 1 && gradeNumber <=18){

            if (gradeNumber >= 1 && gradeNumber <= 5){
                school = "elementary";
            } else if (gradeNumber >= 6 && gradeNumber <= 8) {
                school = "middle";
            }else if (gradeNumber >= 9 && gradeNumber <= 12) {
                school = "high";
            }else if (gradeNumber >= 13 && gradeNumber <= 16) {
                school = "college";
            }else {
                school = "grad";
            }

        }else {
            school = "invalid grade level";
        }
        System.out.println("school = " + school);
    }

}
