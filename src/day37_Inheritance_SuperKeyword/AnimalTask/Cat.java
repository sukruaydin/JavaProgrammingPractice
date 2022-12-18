package day37_Inheritance_SuperKeyword.AnimalTask;

public class Cat extends Animal{

    public boolean isBritish;

    public Cat(String name, String breed, char gender, int age, String size, String color, boolean isBritish) {
        super(name, breed, gender, age, size, color);
        this.isBritish = isBritish;
    }


    public void scratch(){
        System.out.println(name + " is scratching");
    }
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", isBritish=" + isBritish +
                '}';
    }


}
