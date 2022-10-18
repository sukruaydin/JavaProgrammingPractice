package day15_ForWhileLoop.While;

public class JavaPython {

    public static void main(String[] args) {
        //two conditions in one while
        String s = "Java java java JAVA Python PYThon";
        s = s.toLowerCase();

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")){
            if (s.contains("java")){
                s = s.replaceFirst("java", "");
                countJava++;
            }else{
                s = s.replaceFirst("python", "");
                countPython++;
            }
        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);
    }
}
