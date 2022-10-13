package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class FieldTripTask7 {

    public static void main(String[] args) {
        //Your school goes on a Field trip each year. The place you go will be based on your grade.
        //Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.
        int gradeNumber = 2;
        String a;

        if (gradeNumber == 1){
            a = "location -  Apple orchard \nnumber of groups - 3 \nteacher in charge - Ms. Smith";
        } else if (gradeNumber == 2) {
            a = "location - Zoo \nnumber of groups - 7 \nteacher in charge - Mr. Lee\n";
        } else if (gradeNumber == 3) {
            a = "location - Aquarium \nnumber of groups - 5 \nteacher in charge - Ms. Wilson";
        } else if (gradeNumber == 4) {
            a = "location - Movie theater \nnumber of groups - 2 \nteacher in charge - Ms. Reyes";
        } else if (gradeNumber == 5) {
            a = "location - Museum \nnumber of groups - 5 \nteacher in charge - Ms. Lale";
        }else {
            a = "location - Six Flags \nnumber of groups - 8 \nteacher in charge - Mr. Watt";
        }

        System.out.println(a);
    }
}
