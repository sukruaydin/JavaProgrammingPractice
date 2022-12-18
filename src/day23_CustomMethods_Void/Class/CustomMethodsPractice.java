package day23_CustomMethods_Void.Class;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        helloPeople5Times();
        evenNumbersOneToTen();
    }
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }
    public static void helloPeople5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello People");
        }
    }
    public static void evenNumbersOneToTen(){
        System.out.print("Even numbers between 1 ~ 10 : ");
        for (int i = 1; i <= 10 ; i++) {
            if (i%2 == 0){
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

}
