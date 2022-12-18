package day32_CustomClass_Constructor2;


public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Audi");
        Car car2 = new Car("Audi","A3");
        Car car3 = new Car("Audi","A3",2015);
        Car car4 = new Car("Audi","A3",2015,450_000);
        Car car5 = new Car("Audi","A3",2015,450_000,"Black");

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);
        System.out.println("car3 = " + car3);
        System.out.println("car4 = " + car4);
        System.out.println("car5 = " + car5);


    }

}
