package day20_Arrays.Class;

public class AppearedTwice {

    public static void main(String[] args) {
        //appeared twice
        char[] chars = {'A','A','A','B','B'};

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j]){
                    count++;
                }
            }
            if (result.contains(""+chars[i])){
                continue;
            }
            if(count == 2){
                result += ""+chars[i];
            }
        }
        System.out.println("result = " + result);

    }
}
