package day10_NestedIfAndTernaries.Ternaries;

public class FieldTrip3 {

    public static void main(String[] args) {

        int n = 56;
        String result = (n >= 1 && n <= 6) ? ((n == 1) ? "apple" : (n == 2) ? "zoo" :(n == 3) ? "aquarium" : (n == 4) ?
                "theater" : (n == 5) ? "museum" : "six flags")    : "invalid number";
        System.out.println("result = " + result);

    }

}
