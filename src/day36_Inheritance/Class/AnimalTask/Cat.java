package day36_Inheritance.Class.AnimalTask;

//child(sub) class
public class Cat extends Animal { // Cat is an Animal

    public  void meow(){
        System.out.println(name + " meowing");
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }


}
