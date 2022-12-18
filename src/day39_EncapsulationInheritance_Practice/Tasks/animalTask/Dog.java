package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Dog extends FriendlyAnimal{


    public Dog(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
    public void bark(){
        System.out.println(getName() + " is barking");
    }


}
