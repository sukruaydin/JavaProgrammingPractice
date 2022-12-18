package day39_EncapsulationInheritance_Practice.Tasks.deviceTask;

public class Device {

    private String brand, model;
    private double price;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null){
            System.err.println("Brand can NOT be null");
            System.exit(1);
        }

        if (brand.isBlank() || brand.isEmpty()){
            System.err.println("Brand can not ne blank or empty");
            System.exit(1);
        }
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (getModel() == null){
            System.err.println("Model can NOT be null");
            System.exit(0);
        }

        if (model.isBlank() || model.isEmpty()){
            System.err.println("Model can not ne blank or empty");
            System.exit(1);
        }
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price:"+price);
            System.exit(1);
        }
        this.price = price;
    }
    public boolean getHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean getHasPowerButton() {
        return hasPowerButton;
    }
    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }


    public void turnOn(){
        System.out.println(brand + " " + model + " is turning on");
    }
    public void turnOff(){
        System.out.println(brand + " " + model + " is turning off");
    }
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
