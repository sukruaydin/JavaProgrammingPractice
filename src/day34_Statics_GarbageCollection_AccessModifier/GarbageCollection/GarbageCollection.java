package day34_Statics_GarbageCollection_AccessModifier.GarbageCollection;

import day31_CustomClass_Constructors.Class.Student;

import java.util.ArrayList;

public class GarbageCollection {

    public static void main(String[] args) {

        //assigning null
        String str = "java";
        str = null; // after this line str is eligible for garbage collection
        System.out.println("str = " + str);

        System.out.println("-----------------------");

        //assigning another reference
        String s = "python";
        s = "java";
        System.out.println("s = " + s);

        System.out.println("-----------------------");

        //in this situation below we have 1 ArrayList object
        //1 room, 2 doors
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        ArrayList<Integer> list2 = new ArrayList<>(); //eligible for garbage collection
        list2 = list1;
        list2.add(20);
        list2.add(30);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println("-----------------------");

        //in this situation below we have 1 student object
        //1 room, 2 doors
        Student student1 = new Student("ahmet",25,'M','A',11);
        Student student2 = student1;
        student1.grade = 'B';

        System.out.println(student1.name);
        System.out.println(student2.name);

        System.out.println(student1.grade);
        System.out.println(student2.grade);

        System.out.println("-----------------------");

        //STRANGE


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("java");

        ArrayList<String> l2 = new ArrayList<>();
        l1 = l2;
        l2.add("python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);


    }

}
