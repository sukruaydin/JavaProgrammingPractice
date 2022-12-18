package day33_CustomClass_Statics.Class;

public class Employee {

    //1--> instanceVariables
    public String name;
    public double salary;
    public static boolean isHuman = true;

    //2--> constructor

    //3--> instanceMethods
    //3.1--> toString method
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
