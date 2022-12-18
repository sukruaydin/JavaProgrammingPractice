package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild = true;
    public static boolean isFriendly = false;
    public static boolean isPlayable = false;


    public WildAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }


    public void hunt(){
        System.out.println(getName() + " is hunting");
    }
    @Override
    public String toString() {
        return "WildAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }


}
