package day40_FinalKeyword.Class;

//final class can NOT be inherited in other classes
//means --> it can NEVER be parent
public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    /*@Override
    public void drink() {
        System.out.println(getName() + " is drinking beer");
        since this is a final method, it can NOT be changeable, nor OVERRIDDEN
    }*/

    public void bark(){
        System.out.println(getName() + " is barking");
    }

}
