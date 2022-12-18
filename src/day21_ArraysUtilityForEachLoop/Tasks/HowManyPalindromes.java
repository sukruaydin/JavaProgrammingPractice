package day21_ArraysUtilityForEachLoop.Tasks;

public class HowManyPalindromes {

    public static void main(String[] args) {

        String[] s = {"anna","level","java","racecar","şükrü"};

        int count = 0;
        for (String each : s) {
            String reverse = "";
            for (int i = each.length()-1; i >= 0; i--){
                reverse += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reverse)){
                count++;
            }
        }
        System.out.println("count = " + count);

    }

}
