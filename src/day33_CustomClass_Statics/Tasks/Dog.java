package day33_CustomClass_Statics.Tasks;

public class Dog {

    public String breed, size, color;
    public char gender;
    public int age;
    public static int numberOfLegs = 4;
    public static int numberOfEyes = 2;
    public static int numberOfWings = 2;
    public static boolean isFriendly = true;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(breed + " " + size + " " + " " + color + " is eating");
    }

    public void sleep(){
        System.out.println(breed + " " + size + " " + " " + color + " is sleeping");
    }

    public void play(){
        System.out.println(breed + " " + size + " " + " " + color + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", numberOfLegs=" + numberOfLegs +
                ", numberOfEyes=" + numberOfEyes +
                ", numberOfWings=" + numberOfWings +
                ", isFriendly=" + isFriendly +
                '}';
    }


}
/*
1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()

 */
