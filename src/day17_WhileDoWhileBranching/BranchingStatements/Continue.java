package day17_WhileDoWhileBranching.BranchingStatements;

public class Continue {

    public static void main(String[] args) {
        //used for skipping
        //it MUST be before the print statement in order to make sense
        for (char i = 'A'; i <= 'E'; i++){
            if (i == 'C'){
                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("---------------------------------------");

        //print even numbers, use continue statement
        for (int i = 0; i <= 10; i++){
            if (i%2 != 0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");


        //print odd numbers, use continue statement
        for (int i = 0; i <= 10; i++){
            if (i%2 == 0){
                continue;
            }
            System.out.print(i+" ");
        }


    }
}
