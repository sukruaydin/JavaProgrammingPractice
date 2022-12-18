package day39_EncapsulationInheritance_Practice.Tasks.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("çomar","tokat","brown","large",'M',3);
        System.out.println(dog);
        dog.bark();
        dog.eat();

        System.out.println("--------------------------------------------------");

        Cat cat = new Cat("duman","british","gray","small",'F',2);
        System.out.println(cat);
        cat.scratch();
        cat.eat();

        System.out.println("--------------------------------------------------");

        Lion lion = new Lion("GS","sarı kırmızı", "yellow","large",'M',5);
        System.out.println(lion);
        lion.eat();

        System.out.println("--------------------------------------------------");

        Eagle eagle =new Eagle("şükrü","human","white","medium",'M',29);
        System.out.println(eagle);
        eagle.eat();

    }

}
