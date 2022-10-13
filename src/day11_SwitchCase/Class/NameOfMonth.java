package day11_SwitchCase.Class;

public class NameOfMonth {

    public static void main(String[] args) {

        int n = 18;
        String name;

        switch (n){

            case 1:
                name = "jan";
                break;
            case 2:
                name = "feb";
                break;
            case 3:
                name = "mar";
                break;
            case 4:
                name = "apr";
                break;
            case 5:
                name = "may";
                break;
            case 6:
                name = "jun";
                break;
            case 7:
                name = "jul";
                break;
            case 8:
                name = "aug";
                break;
            case 9:
                name = "sep";
                break;
            case 10:
                name = "oct";
                break;
            case 11:
                name = "nov";
                break;
            case 12:
                name = "dec";
                break;
            default:
                name = "invalid number";

        }
        System.out.println("name = " + name);

    }
}
