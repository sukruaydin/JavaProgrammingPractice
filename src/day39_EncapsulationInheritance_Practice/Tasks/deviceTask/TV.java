package day39_EncapsulationInheritance_Practice.Tasks.deviceTask;

public class TV extends Device{

    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }


    public void channelUp(){
        System.out.println(getBrand() + " " + getModel() + " is getting channel-up");
    }
    public void channelDown(){
        System.out.println(getBrand() + " " + getModel() + " is getting channel-down");
    }


}
