package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating cat food");
    }
    public void scratch(){
        System.out.println(getName() + " is scratching");
    }
    public void meow(){
        System.out.println(getName() + " is meowing");
    }


}
