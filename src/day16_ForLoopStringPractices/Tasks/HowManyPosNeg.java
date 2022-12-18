package day16_ForLoopStringPractices.Tasks;

import java.util.Scanner;

public class HowManyPosNeg {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println("enter number " + i);
            int n = scan.nextInt();
            if(n > 0){
                pos++;
            }else if (n < 0){
                neg++;
            }
        }
        System.out.println(pos + " positive " + neg + " negative");
    }
}
