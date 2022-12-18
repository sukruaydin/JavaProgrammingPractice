package day37_Inheritance_SuperKeyword.AnimalTask;

public class Dog extends Animal{

    //Dog needs a constructor since parent class Animal doesn't have default one.
    //we need to call parent's constructor by using super keyword
    public Dog (String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size, color);

    }

    public void bark(){
        System.out.println(name + " is barking");
    }



}
