package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

public class ReverseName {

    public static void main(String[] args) {

        String[] names = {"şükrü aydın","yusuf taş","ömer engin","pehlivan akbaş"};


        for (String each : names) {
            String result = "";
            for (int i = each.length()-1; i >= 0; i--) {
                result += each.charAt(i);
            }
            System.out.println(result);
        }


    }

}
