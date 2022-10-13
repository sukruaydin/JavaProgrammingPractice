package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class NameOfDay {

    public static void main(String[] args) {
        // find the name of the week by using given number between 1~7
        int number = 6;
        if (number == 1){
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4){
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        }else {
            System.out.println("Sunday");
        }


    }

}
