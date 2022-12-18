package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating dolphin food");
    }
    public void swim(){
        System.out.println(getName() + " is swimming");
    }


}
