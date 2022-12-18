package day19_RecapLoopString.Class;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        //frequency of chars
        String s = "aabcccd";
        String result = "";

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
            result += ""+s.charAt(i) + count;
        }
        System.out.println("result = " + result);

    }
}
