package day19_RecapLoopString.Tasks;

public class FirstDuplicated {

    public static void main(String[] args) {


            String s = "qwertyuııı";
            String result = "";

            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)){
                        result += s.charAt(i);
                        System.out.println("result = " + result);
                        System.exit(0);
                    }
                }
            }
    }
}
