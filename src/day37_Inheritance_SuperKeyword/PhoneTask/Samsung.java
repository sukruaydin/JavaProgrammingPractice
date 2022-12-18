package day37_Inheritance_SuperKeyword.PhoneTask;

//final class can NOT be inherited in other classes
//means --> it can NEVER be parent
public final class Samsung extends Phone{


    public Samsung(String model, String size, double price, String color) {
        super("Samsung", model, size, price, color);
    }


    public void freeze(){
        System.out.println(brand + " is freezing");
    }



}
