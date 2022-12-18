package day19_RecapLoopString.Class;

public class UniqueCharacters {

    public static void main(String[] args) {
        //unique chars
        String s = "aabbbşükrü";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }

            if (count == 1){
                result += ""+ s.charAt(i);
            }

        }
        System.out.println("result = " + result);


        //removed duplicates
        String result2 = "";
        for (int i = 0; i < s.length(); i++){
            if (result2.contains(""+s.charAt(i))){
                continue;
            } else {
                result2 += ""+s.charAt(i);
            }
        }
        System.out.println("result2 = " + result2);

    }
}
