package day30_CustomClass.Class;

//this is a Custom Class
public class Dog {

    //1--> instanceVariables
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    //2--> instanceMethods
    //we create it without static key word
    //if it was with it, it can't be used multiple times
    //static--> one copy created for all objects
    public void eat(){
        System.out.println(name + " is eating");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }


    //3--> another useful method
    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender, String dogSize, String dogColor){
        name = dogName;
        breed = dogBreed;
        age = dogAge;
        gender = dogGender;
        size = dogSize;
        color = dogColor;
    }


    /*public String toString(){
        return "Name: " + name;
    }*/



    //4--> toString method to acquire print ability
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
