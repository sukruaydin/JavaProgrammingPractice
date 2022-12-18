package day21_ArraysUtilityForEachLoop.Class.ClassTasks;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"şükrü aydın","yusuf taş","ömer engin","pehlivan akbaş"};

        String result = "";
        for (String each : names){
            result += ""+each.charAt(0) + each.charAt(each.indexOf(" ")+1)+", ";
        }
        System.out.println("result = " + result);


    }

}
