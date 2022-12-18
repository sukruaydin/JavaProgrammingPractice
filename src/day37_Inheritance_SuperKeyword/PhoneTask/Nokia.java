package day37_Inheritance_SuperKeyword.PhoneTask;

//final class can NOT be inherited in other classes
//means --> it can NEVER be parent
public final class Nokia extends Phone{


    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }


    public void selfDefense(){
        System.out.println(brand + " can be used as a self defence tool");
    }


}
