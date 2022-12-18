package day32_CustomClass_Constructor2;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("constructor with int argument");
    }

    public ConstructorCalls(int a, int b){
        //this(); only 1 constructor can be called
        this(a);
        System.out.println("constructor with int argument a, and b");
    }


    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("-----------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(12);

        System.out.println("-----------------------------");

        ConstructorCalls obj3 = new ConstructorCalls(12,13);


    }


}
