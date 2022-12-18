package day21_ArraysUtilityForEachLoop.Tasks;

import java.util.Arrays;

public class JavaAndPython {

    public static void main(String[] args) {

        String s1 = "sukru likes pract.icing java. samet sta?rted to study python. is python hard? maybe, but java is always java.";
        s1 = s1.toLowerCase();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) >= 97 && s1.charAt(i) <= 122 || s1.charAt(i) == 32){
                s2 += s1.charAt(i);
            }
        }

        System.out.println(s2);

        String[] s3 = s2.split(" ");
        System.out.println(Arrays.toString(s3));

        int countJava = 0;
        int countPython = 0;
        for (String each : s3) {
            if (each.equals("java")){
                countJava++;
            }
            if (each.equals("python")){
                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

    }

}
