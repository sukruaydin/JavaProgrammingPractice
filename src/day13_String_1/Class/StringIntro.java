package day13_String_1.Class;

public class StringIntro {

    public static void main(String[] args) {

        String name1 = "Şükrü Aydın";
        String name2 = "Şükrü Aydın";
        System.out.println(name1 == name2);//true.
        //we can compare string data by using ==, ONLY IF it is declared as STRING LITERAL
        //which means, string data in the String Pool.


        System.out.println("--------------------------------------");

        String name3 = new String("Şükrü Aydın");
        String name4 = new String("Şükrü Aydın");

        System.out.println(name3 == name4); //false
        //we can't compare those cuz they are not declared in the String Pool
        //hey are declared in the heap memory outside the String Pool
        //but we can compare them by using equals(); method
        System.out.println(name3.equals(name4)); //true


    }
}
