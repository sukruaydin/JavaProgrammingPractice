package day30_CustomClass.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        //creating the object
        Dog dog1 = new Dog();

        //calling instanceVariables
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";



        //creating the object
        Dog dog2 = new Dog();

        //calling instanceVariables
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";


        //creating the object
        Dog dog3 = new Dog();

        //calling instanceVariables
        dog3.setInfo("maykıl", "alman kurdu",9,'M',"orta", "açık kahve");


        //whenever we provide an OBJECT in print statement compiler looks for toString method
        //without toString method, it gives hashcode
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();
        dog3.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Çomar","Tokat",23,'M',"Large","Gray");
        Dog dog5 = new Dog();
        dog5.setInfo("Kangal","Sivas",8,'F',"Small","Brown");

        Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDogList = new ArrayList<>(Arrays.asList(dogs));
        femaleDogList.removeIf( p -> p.gender == 'M');
        int countFemale = femaleDogList.size();
        System.out.println("countFemale = " + countFemale);

        ArrayList<Dog> maleDogList = new ArrayList<>(Arrays.asList(dogs));
        maleDogList.removeIf( p -> p.gender == 'F');
        int countMale = maleDogList.size();
        System.out.println("countMale = " + countMale);


    }

}
