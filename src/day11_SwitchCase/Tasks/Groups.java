package day11_SwitchCase.Tasks;

public class Groups {

    public static void main(String[] args) {

        String batchName = "türkiye";
        String result = "";

        switch (batchName){

            case "US morning":
                result = "Class times are 10-5 EST. M, T, Th, F.";
                break;

            case "US evening":
                result = "Class times are 7-10 EST. M, T, W, Th, S, S";
                break;

            case "EU":
                result = "Class times are  10-5 EST. M, T, W, Th, F.";
                break;

            default:
                result = batchName + " is an invalid batch name";
        }
        System.out.println(result);
    }
}
