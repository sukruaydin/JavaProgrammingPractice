package day17_WhileDoWhileBranching.BranchingStatements;

public class Exit {

    public static void main(String[] args) {
        //System.exit(0) ---> used for to terminate the JVM
        //print out the numbers 0,1,2
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                System.exit(0);
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("wooden spoon");

    }

}
