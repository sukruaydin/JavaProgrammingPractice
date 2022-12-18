package day40_FinalKeyword.Class;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;


    //setter methods were NOT created for variables with final keyword
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public char getGender() {
        return gender;
    }
    public String getColor() {
        return color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    /*public void setBreed(String breed){
        this.breed = breed;
        since it will be set within constructor first, it doesn't allow us to set again in setter method
    }*/


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        setName(name);
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        setSize(size);
        setAge(age);
    }


    //methods
    //since every animal eat different food, this method can NOT be with final keyword
    public void eat(){
        System.out.println(name + " is eating");
    }
    //since every animal drink water, this method can be with final keyword
    public final void drink(){
        System.out.println(name + " is drinking water");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }


}
