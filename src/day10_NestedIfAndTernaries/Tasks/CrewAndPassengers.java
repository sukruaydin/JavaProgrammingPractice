package day10_NestedIfAndTernaries.Tasks;

public class CrewAndPassengers {

    public static void main(String[] args) {

        int number = 115;
        String result;

        if (number == 50 || number == 75 || number == 100){

            if (number == 50){
                result = "20 crew, 30 passengers";
            } else if (number == 75) {
                result ="25 crew, 50 passengers";
            }else {
                result = "30 crew, 70 passengers";
            }

        }else {
            result = "invalid number";
        }
        System.out.println("result = " + result);

    }

}
