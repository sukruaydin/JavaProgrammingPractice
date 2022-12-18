package day38_Inheritance_MethodOverriding.Class;

public class Audi extends Car{

    public Audi(String model, int year, double price, String color, int miles) {
        super("Audi", model, year, price, color, miles);
    }


    public void start(){
        System.out.println("Push the button to start the engine " + brand + " " + model);
    }


}
