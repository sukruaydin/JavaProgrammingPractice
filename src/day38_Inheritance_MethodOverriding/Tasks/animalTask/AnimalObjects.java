package day38_Inheritance_MethodOverriding.Tasks.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Cat cat = new Cat("Meow","British",3,'F',"Small","Gray");
        cat.eat();

        Dog dog = new Dog("Çomar","Tokat",5,'M',"Medium","Brown");
        dog.eat();

        Eagle eagle = new Eagle("Kartal","Ankara",1,'M',"Large","Black");
        eagle.eat();

        Tiger tiger = new Tiger("Kaplan","Africa",4,'F',"Large","Yellow");
        tiger.eat();

    }

}
