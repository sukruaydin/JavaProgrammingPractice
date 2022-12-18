package day34_Statics_GarbageCollection_AccessModifier.StaticBlock;

public class StaticBlock {

    //you were able to run the class with static block before JavaVersion_8
    //static block is the first block to get executed by default
    //it runs just 1 time, so we can initialize the staticVariables inside there
    //you can have multiple static blocks

    public static void main(String[] args) {

        System.out.println("main method");

    }

    static {

        System.out.println("static block");

    }




}
