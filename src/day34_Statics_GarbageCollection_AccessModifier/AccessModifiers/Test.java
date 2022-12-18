package day34_Statics_GarbageCollection_AccessModifier.AccessModifiers;

//staticImport

import static day34_Statics_GarbageCollection_AccessModifier.AccessModifiers.AccessModifiers.lastName;
import static day34_Statics_GarbageCollection_AccessModifier.AccessModifiers.AccessModifiers.methodB;

public class Test {

    public static void main(String[] args) {

        //IN SAME PACKAGE

        //since methods and variables are STATIC in AccessModifiers' class, we can call them through their own name

        System.out.println(AccessModifiers.firstName);
        System.out.println(lastName);
        //System.out.println(AccessModifiers.location); private, can't be reached


        AccessModifiers.methodA();
        methodB();
        //AccessModifiers.methodC(); private, can't be reached

        AccessModifiers a1 = new AccessModifiers();
        System.out.println(a1.i);//since it is default modifier, we can reach



    }

}
