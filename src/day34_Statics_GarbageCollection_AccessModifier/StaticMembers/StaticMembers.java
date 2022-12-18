package day34_Statics_GarbageCollection_AccessModifier.StaticMembers;

public class StaticMembers {

    //WE ARE NOT GOING TO CREATE STATIC CLASS
    //IN CASE THERE IS A QUESTION LIKE --> CAN WE CREATE A STATIC CLASS
    //ANSWER --> BELOW;

    //These are staticMembers
    //staticVariable
    public static int number;

    //staticMethod
    public static void method(){

    }

    //staticBlock
    static {

        number = 5;

    }


}


/*
********
can a class be a static class?
answer = depends
first we need a nested class
outer class can't be a static class
but inner class can bee
CUZ ALL STATICS HAVE TO BELONG TO A CLASS, SO THEY CAN'T BE INDEPENDENT
********

 */

class A{ //outer class

    static class B{ //inner class can be static
        public static void methodA(){
            System.out.println("ABC");
        }
    }

}

class C{

    public static void main(String[] args) { //main method is already static
        A.B.methodA(); //to call methodA, we need its outer className, then its own className

    }

}