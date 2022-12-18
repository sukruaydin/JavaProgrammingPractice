package day27_WrapperClasses.Class;

public class WrapperClassesMethods {

    public static void main(String[] args) {

        //parseInt, parseDouble.. method
        String str = "123";

        int num = Integer.parseInt(str); //returns primitive
        System.out.println(num + 1);
        System.out.println(str + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);
        System.out.println(num2 + 0.5);
        System.out.println(str2 + 0.5);

        String s = "true";
        boolean isTrue = Boolean.parseBoolean(s);
        System.out.println(isTrue);
        System.out.println("===========================================");

        //min & max values
        int max = Integer.MAX_VALUE;
        System.out.println("max int = " + max);
        int min = Integer.MIN_VALUE;
        System.out.println("min int = " + min);

        long max1 = Long.MAX_VALUE;
        System.out.println("max long = " + max1);
        long min1 = Long.MIN_VALUE;
        System.out.println("min long = " + min1);
        System.out.println("===========================================");

        //valueOf method
        String a = "345";
        Integer x = Integer.valueOf(a); //returns an Integer(wrapper class)
        int y = Integer.valueOf(a); //since it returns Integer, we can assign back an int value(UNBOXING)
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("===========================================");

        //Character. methods
        char ch = '0';
        char ch2 = 'A';

        //isDigit, isLetter method
        boolean aa = Character.isDigit(ch);
        boolean bb = Character.isLetter(ch);
        boolean cc = Character.isLetter(ch2);

        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("cc = " + cc);
        System.out.println("===========================================");

        //there is no method for special characters, but
        char n = '!';
        boolean nn = !Character.isLetterOrDigit(n);
        System.out.println("nn = " + nn);
        System.out.println("===========================================");

        //isUpperCase, isLowerCase methods
        char m = 'G';
        boolean mm = Character.isUpperCase(m);
        boolean kk = Character.isLowerCase(m);
        System.out.println("mm = " + mm);
        System.out.println("kk = " + kk);
        System.out.println("===========================================");






    }

}
