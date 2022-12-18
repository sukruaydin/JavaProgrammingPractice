package day31_CustomClass_Constructors.Class;

public class Student {

    //1--> instanceVariables
    public String name;
    public int age;
    public char gender;
    public char grade;
    public int ID;

    //2--> constructor ,(additionally used for initializing the instanceVariables)
    public Student(String name, int age, char gender, char grade, int ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
        this.ID = ID;
    }

    //3--> instanceMethods
    //3.1--> toString method
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", ID=" + ID +
                '}';
    }



}
