package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Animal {

    private String name, breed, color,size;
    private char gender;
    private int age;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can NOT be null");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can NOT be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        if (breed.isEmpty() || breed.isBlank()){
            System.err.println("Breed can NOT be empty or blank");
            System.exit(1);
        }
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()){
            System.err.println("Color can NOT be empty or blank");
            System.exit(1);
        }
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (size.isEmpty() || size.isBlank()){
            System.err.println("Size can NOT be empty or blank");
            System.exit(1);
        }
        this.size = size;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if ( ! (gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender:"+gender);
            System.exit(1);
        }
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0){
            System.err.println("Age can NOT be zero or negative:"+age);
            System.exit(1);
        }
        this.age = age;
    }


    public Animal(String name, String breed, String color, String size, char gender, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setSize(size);
        setGender(gender);
        setAge(age);
    }


    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public void move(){
        System.out.println(name + " is moving");
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }


}
