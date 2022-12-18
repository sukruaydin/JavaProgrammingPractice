package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class FriendlyAnimal extends Animal{

    public static boolean isWild = false;
    public static boolean isFriendly = true;
    public static boolean isPlayable = true;


    public FriendlyAnimal(String name, String breed, String color, String size, char gender, int age) {
        super(name, breed, color, size, gender, age);
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }
    @Override
    public String toString() {
        return "FriendlyAnimal{" +
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
