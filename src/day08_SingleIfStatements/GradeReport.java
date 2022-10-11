package day08_SingleIfStatements;

public class GradeReport {

    public static void main(String[] args) {

        int score = 65;
        if(score >=90 && score <= 100){
            System.out.println("excellent");
        }
        if(score >= 80 && score <90){
            System.out.println("great");
        }
        if(score >= 70 && score <80){
            System.out.println("good");
        }
        if(score >= 60 && score <70){
            System.out.println("passed");
        }
        if(score >= 0 && score <60){
            System.out.println("failed");
        }


    }

}
