package day10_NestedIfAndTernaries.Ternaries;

public class ConvertNumbers {
    public static void main(String[] args) {

        int n = 10;
        String result = (n == 0) ? "zero" : (n == 1) ? "one" : (n == 2) ? "two" : (n == 3) ? "three"
                : (n == 4) ? "four" : (n == 5) ? "five" : (n == 6) ? "six" : (n == 7) ? "seven"
                : (n == 8) ? "eight" : (n == 9) ? "nine" : "invalid number";
        System.out.println("result = " + result);


    }
}
