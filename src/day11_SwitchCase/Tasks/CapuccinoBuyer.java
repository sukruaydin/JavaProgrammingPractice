package day11_SwitchCase.Tasks;

public class CapuccinoBuyer {

    public static void main(String[] args) {

        String sizeName = "venti";
        String result = "";

        switch (sizeName){

            case "tall":
                result = sizeName + "\nprice is $3.69 \n90 calories";
                break;

            case "grande":
                result = sizeName + "\nprice is $3.99 \n120 calories";
                break;

            case "venti":
                result = sizeName + "\nprice is $4.29 \n150 calories";
                break;

            default:
                result = sizeName + " is invalid size name";

        }
        System.out.println(result);
    }
}
