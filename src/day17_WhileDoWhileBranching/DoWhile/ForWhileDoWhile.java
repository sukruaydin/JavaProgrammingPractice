package day17_WhileDoWhileBranching.DoWhile;

public class ForWhileDoWhile {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");


        int i = 1;
        while (i <= 10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        System.out.println("--------------------------------------");


        int j = 1;
        do {
            System.out.print(j+" ");
            j++;
        }while (j <= 10);
        System.out.println();
        System.out.println("--------------------------------------");


    }
}
