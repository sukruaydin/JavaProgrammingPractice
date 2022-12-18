package day39_EncapsulationInheritance_Practice.Tasks.deviceTask;

public class Computer extends Device{

    private int RAM;


    public int getRAM(){
        return RAM;
    }
    public void setRAM(int RAM){
        if (RAM<=0){
            System.err.println("Invalid RAM:"+RAM);
            System.exit(1);
        }
        this.RAM = RAM;
    }


    public Computer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, int RAM) {
        super(brand, model, price, hasBattery, hasPowerButton);
        setRAM(RAM);
    }


    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + getHasBattery() +
                ", hasPowerButton=" + getHasPowerButton() +
                ", RAM=" + RAM +
                '}';
    }
}
