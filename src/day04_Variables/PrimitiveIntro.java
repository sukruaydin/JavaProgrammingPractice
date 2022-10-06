package day04_Variables;

public class PrimitiveIntro {

    public static void main(String[] args) {

        //29 year-old
        byte age = 29;  //range -128 to 127

        //weight 160 pounds
        short weight = 160; //range -32000 to 32000

        //salary 100000 $
        int salary = 100_000; // range -2 billion to 2 billion // preferred data type

        //population of world 8 billion
        long popWorld = 8_000_000_000L; //range -many to many //you have to add "L" or "l" to make it uderstandable for computer

        //tax 0.26
        float tax = 0.26f; // you have to add "F" or "f" to make it uderstandable for computer

        //PI 3.14
        double PI = 3.14;

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 45295;
        System.out.println("ch3 = " + ch3);

        boolean isFullTime = true;
        boolean isMarried = false;
        boolean result = 100>300;
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

    }

}
