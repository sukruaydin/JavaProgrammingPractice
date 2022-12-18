package day19_RecapLoopString.Tasks;

public class FirstDupIndex {

    public static void main(String[] args) {

        String s = "asdffgg";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    System.out.println(i);
                    System.exit(0);
                }
            }
        }

    }
}
