package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Lion extends WildAnimal{


    public Lion(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating lion food");
    }


}
