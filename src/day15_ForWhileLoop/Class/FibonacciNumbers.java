package day15_ForWhileLoop.Class;

public class FibonacciNumbers {

    public static void main(String[] args) {
        //print the first 8 fibonacci numbers
        int n1 = 0;
        int n2 = 1;

        String result = n1 +" "+n2+" ";

        for (int i = 0; i <= 5; i++) {

            int sum = n1+n2;
            result += sum+" ";
            n1 = n2;
            n2 = sum;
        }
        System.out.println("result = " + result);
    }
}
