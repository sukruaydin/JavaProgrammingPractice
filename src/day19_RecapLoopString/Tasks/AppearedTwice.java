package day19_RecapLoopString.Tasks;

public class AppearedTwice {

    public static void main(String[] args) {

        String s = "aaabbbccddmmeee";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+s.charAt(i)) || count !=2){
                continue;
            }
            result += s.charAt(i);
        }
        System.out.println("result = " + result);

    }
}
