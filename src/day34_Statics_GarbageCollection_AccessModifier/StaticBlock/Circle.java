package day34_Statics_GarbageCollection_AccessModifier.StaticBlock;

import java.util.ArrayList;

public class Circle {

    // INSTANCE vs STATIC

    public double radius;
    public static double pi;
    public static String name;
    public static ArrayList<Integer> numbers;

    public Circle(double radius) {
        this.radius = radius;
        // pi = 3.14; it is not giving compile error, but NEVER DO THIS
        // constructor belongs to instanceVariables, so it can accept staticVariables
        // means --> object can have what class has
    }


    static {
        pi = 3.14;
        name = "Circle";
        // radius = 2; it gives compile error
        // static block belongs to staticVariables, so it DOESN'T accept instanceVariables
        // means --> class doesn't have what object has -->
        // cuz, objects are created from class, class is not created from objects

        // why do we need static block. why don't we initialize right after we declared?
        // cuz, in the future it will not be possible to initialize in one line, it will need multiple steps
        //for instance :)) --> we have an ArrayList staticVariable, but we can't initialize its values up there,
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        //Q = can staticVariables be initialized in main method?
        //A = Yes. but we can NOT use initialized versions of them outside that main method.
        //So there is no point of initializing them in main method


    }


}
