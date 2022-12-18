package day19_RecapLoopString.Tasks;

public class HighestFrequency {

    public static void main(String[] args) {

        String s = "aaaabbbcccccdsafghjrywyrmadtjccccccccc";
        String result = "";
        int n = 0;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if (result.contains(""+s.charAt(i))){
                continue;
            }
            if (count > n){
                n = count;
                result = ""+s.charAt(i);
            }

        }
        System.out.println("result = " + result);
    }
}
