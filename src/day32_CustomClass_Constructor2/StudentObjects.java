package day32_CustomClass_Constructor2;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("şükrü");
        System.out.println("student1 = " + student1);

        Student student2 = new Student("şükrü",'M');
        System.out.println("student2 = " + student2);

        Student student3 = new Student("şükrü",2748);
        System.out.println("student3 = " + student3);

        Student student4 = new Student("şükrü",2748,'A');
        System.out.println("student4 = " + student4);

        Student student5 = new Student("şükrü",'M',29);
        System.out.println("student5 = " + student5);

        Student student6 = new Student("şükrü",'M',29,2748);
        System.out.println("student6 = " + student6);

        Student student7 = new Student("şükrü",'M',29,2748,'A');
        System.out.println("student7 = " + student7);

        //collecting them together in an array
        Student[] students = {student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students));






    }


}
