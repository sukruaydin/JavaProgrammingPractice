package day24_CustomMethods_Return.Class;

public class ReturnStatement2 {

    public static void main(String[] args) {

        nameOfMonth(30);

    }

    public static void nameOfMonth(int monthNumber){

        if (monthNumber < 1 || monthNumber > 12){
            System.out.println("invalid number given");
            return; //just exits nameOfMonth method
        }
        switch (monthNumber){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            default:
                System.out.println("dec");
                break;

        }


    }

}
