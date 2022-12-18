package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Parrot extends FriendlyAnimal{

    public Parrot(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating parrot food");
    }
    public void fly(){
        System.out.println(getName() + " is flying");
    }
    public void sing(){
        System.out.println(getName() + " is singing");
    }


}
