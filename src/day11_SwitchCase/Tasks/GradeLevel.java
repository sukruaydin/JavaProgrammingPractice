package day11_SwitchCase.Tasks;

public class GradeLevel {

    public static void main(String[] args) {

        int num = 19;
        String result = "";

        switch (num){

            case 1: case 2: case 3: case 4: case 5:
                result = "elementary school";
                break;

            case 6: case 7: case 8:
                result = "middle school";
                break;

            case 9: case 10: case 11: case 12:
                result = "high school";
                break;

            case 13: case 14: case 15: case 16:
                result = "college";
                break;

            case 17: case 18:
                result = "grad school";
                break;

            default:
                result = "invalid grade level";
        }
        System.out.println("result = " + result);

    }

}
