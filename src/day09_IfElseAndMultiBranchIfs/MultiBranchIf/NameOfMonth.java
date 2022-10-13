package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class NameOfMonth {

    public static void main(String[] args) {
        // name of the month by given number 1~12
        int number = 11;
        String nameOfTheMonth;

        if (number == 1){
            nameOfTheMonth = "january";
        } else if (number == 2) {
            nameOfTheMonth = "february";
        } else if (number == 3) {
            nameOfTheMonth = "march";
        } else if (number == 4) {
            nameOfTheMonth = "april";
        } else if (number == 5) {
            nameOfTheMonth = "may";
        } else if (number == 6) {
            nameOfTheMonth = "june";
        } else if (number == 7) {
            nameOfTheMonth = "july";
        } else if (number == 8) {
            nameOfTheMonth = "august";
        } else if (number == 9) {
            nameOfTheMonth = "september";
        } else if (number == 10) {
            nameOfTheMonth = "october";
        } else if (number == 11) {
            nameOfTheMonth = "november";
        }else{
            nameOfTheMonth = "december";
        }

        System.out.println(nameOfTheMonth);
    }

}
