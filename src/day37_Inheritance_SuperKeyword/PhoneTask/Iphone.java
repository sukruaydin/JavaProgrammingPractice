package day37_Inheritance_SuperKeyword.PhoneTask;

//final class can NOT be inherited in other classes
//means --> it can NEVER be parent
public final class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color){
        super("Apple", model, size, price, color);
    }


    public void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling on facetime");
    }
    public void faceTime(String email){
        System.out.println(email + " is calling on facetime");
    }



}
