package day37_Inheritance_SuperKeyword.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Çomar","Sivas",'F',3,"Big","Brown");

        System.out.println("dog1 = " + dog1);

        dog1.bark();

        System.out.println("-----------------------------------------");

        Cat cat1 = new Cat("Duman","Turkish",'M',2,"Medium","Black",false);

        System.out.println("cat1 = " + cat1);

        cat1.scratch();

        System.out.println("-----------------------------------------");

        Parrot parrot1 = new Parrot("Bülbül","Şark",'F',1,"Small","Yellow","Green");

        System.out.println("parrot1 = " + parrot1);

        parrot1.sing();




    }

}
