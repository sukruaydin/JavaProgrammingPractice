package day19_RecapLoopString.Tasks;

public class IndexFirstUnique {

    public static void main(String[] args) {

        String s = "adsadsffgh";

        for (int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                System.out.println(i);
                break;
            }
        }

    }
}
