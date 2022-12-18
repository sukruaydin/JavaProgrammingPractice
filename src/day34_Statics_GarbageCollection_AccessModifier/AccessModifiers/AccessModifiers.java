package day34_Statics_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiers {

    //PUBLIC, PROTECTED, DEFAULT, PRIVATE  (PROTECTED IS NOT COVERED)

    //variables

    //public access modifier (EVERYWHERE)
    public static String firstName = "şükrü";

    //default-no name access modifier (SAME PACKAGE OR SUB_PACKAGE)
    static String lastName = "aydın";
    String  i = "instance";

    //private access modifier (SAME CLASS)
    private static String location = "bağcılar";


    //methods

    //public access modifier (EVERYWHERE)
    public static void methodA(){
        System.out.println("methodA");
    }

    //default-no name access modifier (SAME PACKAGE)
    static void methodB(){
        System.out.println("methodB");
    }

    //private access modifier (SAME CLASS)
    private static void methodC(){
        System.out.println("methodC");
    }



    public static void main(String[] args) {

        //IN SAME CLASS

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(location);
        methodA();
        methodB();
        methodC();

        AccessModifiers a1 = new AccessModifiers();
        System.out.println(a1.i);

    }


}
