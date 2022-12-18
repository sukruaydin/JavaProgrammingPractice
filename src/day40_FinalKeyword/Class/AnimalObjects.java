package day40_FinalKeyword.Class;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog = new Dog("çomar","tokat",'M',"brown","medium",3);

        System.out.println(dog);

        System.out.println("-----------------------------------------");

        dog.eat();
        dog.drink();
        dog.bark();

        System.out.println("-----------------------------------------");

        dog.setName("maykıl");
        System.out.println(dog);


    }

}
