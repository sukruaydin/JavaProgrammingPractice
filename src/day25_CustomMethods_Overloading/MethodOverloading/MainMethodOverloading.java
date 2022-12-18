package day25_CustomMethods_Overloading.MethodOverloading;

public class MainMethodOverloading {
    public static void main(String[] args) {
        //can be an interview question
        //main method can be overloaded but not used
        System.out.println("String");

        int[] a = {1,2};
        main(a);
    }

    public static void main(int[] args) {
        System.out.println("int");
    }
    public static void main(double[] args) {
        System.out.println("double");
    }
    public static void main(char[] args) {
        System.out.println("char");
    }
}
