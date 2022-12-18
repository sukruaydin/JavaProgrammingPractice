package day36_Inheritance.Class.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Maykıl", "German", 'M',"Medium", 5,"Brown");
        dog1.eat();
        dog1.bark();
        //dog1.roar() I can NOT call since this is a method of tiger class

        System.out.println("dog1 = " + dog1);

        System.out.println("-------------------------------------");

        Cat cat1 = new Cat();
        cat1.setInfo("Tekir","Anadolu",'F',"Small",2,"White");
        cat1.eat();
        cat1.meow();
        //cat1.roar() I can NOT call since this is a method of tiger class

        System.out.println("cat1 = " + cat1);


        System.out.println("-------------------------------------");

        Tiger tiger1 = new Tiger();
        tiger1.setInfo("Seri","South Africa",'M',"Large",7,"Orange");
        tiger1.eat();
        tiger1.roar();
        tiger1.hunt();
        //tiger1.meow() I can NOT call since this is a method of cat class

        System.out.println("tiger1 = " + tiger1);


    }

}
