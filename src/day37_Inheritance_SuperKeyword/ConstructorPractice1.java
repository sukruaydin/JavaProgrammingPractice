package day37_Inheritance_SuperKeyword;

class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{
    public B(){
        //since parent class' constructor is default --> super is implicitly called
        System.out.println("B");
    }
}


public class ConstructorPractice1 {

    public static void main(String[] args) {

        B b = new B();//prints A B


    }
}
