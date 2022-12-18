package day38_Inheritance_MethodOverriding.WarmUp;

public class BMW extends Car{

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }


    public void breaksDown(){
        System.out.println(brand + " " + model + " is broken down");
    }
    public void racing(){
        System.out.println(brand + " " + model + " is having a race");
    }



}
