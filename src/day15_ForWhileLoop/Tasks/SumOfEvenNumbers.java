package day15_ForWhileLoop.Tasks;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        //sum of even numbers 0~100
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }
}
