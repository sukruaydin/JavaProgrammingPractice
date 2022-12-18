package day38_Inheritance_MethodOverriding.Class;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Camry",2020,20_000,"Gray",125_000);

        Tesla tesla1 = new Tesla("Model S", 2022, 95_000,"Red",0);

        Audi audi1 = new Audi("A6",2021,85_000,"Black",25_000);

        toyota1.start();
        tesla1.start();
        audi1.start();

    }
}
