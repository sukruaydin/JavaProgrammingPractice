package day40_FinalKeyword.Class;

//final class can NOT be inherited in other classes
//means --> it can NEVER be parent
public final class Cat extends Animal{

    public Cat(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


}
