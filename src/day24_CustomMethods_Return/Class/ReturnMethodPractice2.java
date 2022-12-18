package day24_CustomMethods_Return.Class;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        char result = grade(150);

        if (result == 'A'){
            System.out.println("excellent");
        } else if (result == 'B') {
            System.out.println("great");
        }else if (result == 'C') {
            System.out.println("good");
        }else if (result == 'D') {
            System.out.println("passed");
        }else if (result == 'F'){
            System.out.println("failed");
        }

    }

    public static char grade(int score){

        if (score < 0 || score > 100){
            System.out.println("invalid score");
           return 'Z'; //can not be used only return here
        }
        char grade = (score>=90&&score<=100)? 'A' :(score>=80&&score<=89)? 'B' :(score>=70&&score<=79)? 'C'
                        :(score>=60&&score<=69)? 'D' : 'F';
        return grade;
    }

}
