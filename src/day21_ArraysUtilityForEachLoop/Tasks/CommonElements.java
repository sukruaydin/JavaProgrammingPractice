package day21_ArraysUtilityForEachLoop.Tasks;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,1};
        int[] arr2 = {4,5,6,7,8,1,1};

        String result = "";
        for (int each1 : arr1) {
            int count = 0;
            for (int each2 : arr2) {
                if (each1 == each2){
                    count++;
                }
            }
            if (result.contains(""+each1)){
                continue;
            }
            if (count >= 1){
                result += each1+" ";
            }

        }
        System.out.println("result = " + result);

    }

}
