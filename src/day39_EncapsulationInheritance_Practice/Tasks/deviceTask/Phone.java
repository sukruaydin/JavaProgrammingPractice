package day39_EncapsulationInheritance_Practice.Tasks.deviceTask;

public class Phone extends Device{

    public Phone(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling " + getBrand() + " " + getModel());
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting " + getBrand() + " " + getModel());
    }

}
