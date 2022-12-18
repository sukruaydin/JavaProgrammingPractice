package day33_CustomClass_Statics.Class;

public class Iphone {

    //STATIC BELONGS TO THE CLASS
    //INSTANCE BELONGS TO THE OBJECT --> OBJECT COMES FROM CLASS

    //1--> instanceVariables
    public static String brand = "Apple";
    public String model;
    public double price;
    public static String operatingSystem = "iOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;
    public static boolean hasFaceTime = true;

    //2--> constructor

    //3--> instanceMethods
    //(staticMethods only accepts staticVariables)
    //(instanceMethods accepts both staticVariables and instanceVariables)

    //3.1--> printModelAndPrice
    public static  void printModelAndPrice(){
        //System.out.println(brand + " : " + model + " : " + price); --> staticMethod only accepts staticVariables
    }

    //3.1--> printBrandModelAndPrice
    public void printBrandModelAndPrice(){
        System.out.println(brand + " : " + model + " : " + price);
    }

    //3.2--> printOS
    //we could have declared this as instanceMethod since instanceMethod accepts staticVariables
    //so, why should we declare staticMethod, what benefit?
    //only 1 copy shared by all object
    //it doesn't require creating object to call this method
    //it is called through class name
    public static void printBrand(){
        System.out.println(brand);
    }


}
