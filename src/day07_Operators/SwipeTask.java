package day07_Operators;

public class SwipeTask {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
