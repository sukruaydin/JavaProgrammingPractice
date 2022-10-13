package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class FieldTripTask7_2 {

    public static void main(String[] args) {

        int grade = 7;
        String location = "",
                teacher = "";
        int groupNumber = 0;

        if (grade >= 1 && grade <= 6){

            if (grade == 1){
                location = "apple";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }else if (grade == 3) {
                location = "aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            }else if (grade == 4) {
                location = "theater";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            }else if (grade == 5) {
                location = "museum";
                groupNumber = 5;
                teacher = "Ms. Lale";
            }else {
                location = "six flags";
                groupNumber = 8;
                teacher = "Mr. Watt";
            }
            System.out.println("grade = " + grade+"\nlocation = " + location+"\ngroupNumber = "
                    + groupNumber+"\nteacher = " + teacher);

        }else{
            System.out.println("invalid grade");
        }


    }
}
