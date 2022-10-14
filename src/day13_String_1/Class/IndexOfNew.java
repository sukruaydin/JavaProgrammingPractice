package day13_String_1.Class;

public class IndexOfNew {

    public static void main(String[] args) {
        //find the second u
        String s = "sukru aydin";
        int firstU = s.indexOf("u");
        System.out.println("firstU = " + firstU);

        int secondU = s.indexOf("u",firstU+1);
        System.out.println("secondU = " + secondU);
    }
}
