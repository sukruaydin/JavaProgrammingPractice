package day30_CustomClass.Class;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Hale",'F',26,1465,'A');

        Student student2 = new Student();
        student2.setInfo("Şükrü",'M',29,1470,'D');

        Student student3 = new Student();
        student3.setInfo("Hülya",'F',48,1460,'B');

        Student student4 = new Student();
        student4.setInfo("Bekir", 'M',52,1457,'A');

        Student student5 = new Student();
        student5.setInfo("Nagihan",'F',45,1462,'C');

        //collecting them together into a data structure
        Student[] students = {student1,student2,student3,student4,student5};
        for (Student each : students) {
            System.out.println(each);
        }
        System.out.println();

        ArrayList<Student> earlyBirds = new ArrayList<>(Arrays.asList(students));//grade : A
        earlyBirds.removeIf( p -> p.grade != 'A');
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("how many early-bird students: " + earlyBirds.size());

        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students));//NOT grade : A
        angryBirds.removeIf( p -> p.grade == 'A');
        System.out.println("angryBirds = " + angryBirds);
        System.out.println("how many angry-bird students: " + angryBirds.size());





    }

}
