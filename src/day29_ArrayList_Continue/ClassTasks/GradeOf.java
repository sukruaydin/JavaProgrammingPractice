package day29_ArrayList_Continue.ClassTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeOf {

    public static void main(String[] args) {

        //Write a program that can count the total numbers of grade A, B, C, D and F

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf( p -> (!(p>=90 && p<=100)));
        System.out.println("number of students got A: "+gradeOfA.size());

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf( p -> (!(p>=80 && p<=89)));
        System.out.println("number of students got B: "+gradeOfB.size());

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf( p -> (!(p>=70 && p<=79)));
        System.out.println("number of students got C: "+gradeOfC.size());

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf( p -> (!(p>=60 && p<=69)));
        System.out.println("number of students got D: "+gradeOfD.size());

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeAll(gradeOfA);//since it is a collection type we didn't need as.List method
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("number of students got F: "+gradeOfF.size());




    }

}
