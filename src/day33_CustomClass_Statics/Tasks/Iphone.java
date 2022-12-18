package day33_CustomClass_Statics.Tasks;

public class Iphone {

    public String model;
    public int price;
    public String color;
    public String size;
    public static String brand = "Apple";
    public static String operatingSystem = "iOS";
    public static String madeIn = "China";

    public Iphone(String model, int price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public static void faceTime(long phoneNumber){
        System.out.println(phoneNumber + " is calling on FaceTime");
    }

    public static void faceTime(String email){
        System.out.println(email + " is calling on FaceTime");
    }

    public static void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling");
    }

    public static void text(long phoneNumber){
        System.out.println(phoneNumber + " texted");
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}

/*
	1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */