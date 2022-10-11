package day08_SingleIfStatements;

public class GradeReport2 {

    public static void main(String[] args) {
        //by using boolean variable type  and ! operator
        int score = 91;
        boolean a = score >= 90 && score <100;
        boolean b = score >= 80 && !a;
        boolean c = score >= 70 && !a && !b;
        boolean d = score >= 60 && !a && !b && !c;
        boolean f = score >= 0 && !a && !b && !c && !d;

        if(a){
            System.out.println("excellent");
        }
        if(b){
            System.out.println("great");
        }
        if(c){
            System.out.println("good");
        }
        if(d){
            System.out.println("passed");
        }
        if(f){
            System.out.println("failed");
        }


    }

}
