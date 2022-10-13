package day11_SwitchCase.Tasks;

public class Elevator {

    public static void main(String[] args) {

        int floorNumber = 6;
        String result = "";

        switch (floorNumber){

            case 1:
                result = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
                break;

            case 2:
                result = "Floor 2 selected. Companies: Turkcell, NASA, Intelsat";
                break;

            case 3:
                result = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
                break;

            default:
                result = "invalid floor number : " + floorNumber;
        }
        System.out.println(result);
    }

}
