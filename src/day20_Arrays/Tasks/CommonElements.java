package day20_Arrays.Tasks;

public class CommonElements {

    public static void main(String[] args) {

        int[] n1 = {1,2,3,4,5,4};
        int[] n2 = {4,5,6,7,8};

        String result = "";

        for (int i = 0; i < n1.length; i++) {
            int count = 0;
            for (int j = 0; j < n2.length; j++) {
                if(n1[i] == n2[j]){
                    count++;
                }
            }
            if (count == 0 || result.contains(""+n1[i])){
                continue;
            }

            result += n1[i] +" ";
        }
        System.out.println(result);
    }
}
