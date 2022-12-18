package day37_Inheritance_SuperKeyword;

class C{
    public C(int a){
        System.out.println("C");
    }
}

class D extends C{
    public D(int a) {
        //since the parent class' constructor is with arg --> super needs to be called explicitly
        super(a);
        System.out.println("D");
    }
}

public class ConstructorPractice2 {

    public static void main(String[] args) {

        D d = new D(5);

    }

}
