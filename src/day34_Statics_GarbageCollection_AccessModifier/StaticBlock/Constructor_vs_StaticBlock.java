package day34_Statics_GarbageCollection_AccessModifier.StaticBlock;

public class Constructor_vs_StaticBlock {

    // EXECUTION FLOW
    // STATIC > MAIN > CONSTRUCTOR

    static { //static block

        System.out.println("static block");

    }

    public Constructor_vs_StaticBlock(){ //constructor block

        System.out.println("constructor block");

    }

    public static void main(String[] args) { //main method

        System.out.println("main method");
        //why constructor didn't get executed? --> cuz, we didn't create an object

        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();
        new Constructor_vs_StaticBlock();


    }


}
