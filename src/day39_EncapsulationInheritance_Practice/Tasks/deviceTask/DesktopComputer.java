package day39_EncapsulationInheritance_Practice.Tasks.deviceTask;

public class DesktopComputer extends Computer{

    public DesktopComputer(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton, int RAM) {
        super(brand, model, price, hasBattery, hasPowerButton, RAM);
    }
}
