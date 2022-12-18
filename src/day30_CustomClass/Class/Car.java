package day30_CustomClass.Class;

//this is a Custom Class
public class Car {

    //1--> instanceVariables (attributes)
    public String brand;
    public String model;
    public String color;
    public int year;
    public int price;

    //2--> instanceMethods (actions)
    public void drive(){
        System.out.println(brand + " is being driven");
    }

    public void start(){
        System.out.println(brand + " is started");
    }

    public void stop(){
        System.out.println(brand + " is stopped");
    }

    //3--> useful methods
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, int carPrice){
        brand = carBrand;
        model = carModel;
        color = carModel;
        year = carYear;
        price = carPrice;
    }

    //4--> toString method
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
