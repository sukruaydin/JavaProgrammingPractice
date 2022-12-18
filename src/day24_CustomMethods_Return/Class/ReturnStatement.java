package day24_CustomMethods_Return.Class;

public class ReturnStatement {

    public static void main(String[] args) {

        nameOfDay(10);
        System.out.println("hello world");

    }

    public static void nameOfDay(int dayNumber){

        if (dayNumber < 1 || dayNumber > 7){
            System.out.println("invalid number given");
            return; //just exits the nameOfDay method
            // break --> is used with loops and switch
            // System.exit(0) --> is used to terminate everything
        }
        switch (dayNumber){

            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            default:
                System.out.println("sun");

        }

    }

}
