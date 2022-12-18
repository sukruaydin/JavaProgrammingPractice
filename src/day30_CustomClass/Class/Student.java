package day30_CustomClass.Class;

//this is Student Custom Class
public class Student {

    //1--> attributes - instanceVariables
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

    //2--> actions - instanceMethods
    //2.1--> creating setInfo method
    //the ones above are instanceVariables
    //the ones below localVariables
    //they can share same names
    //this. --> call the instanceVariables
    //with the help of "this." --> instanceVariables can share same names with localVariables
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    //2.2--> toString method
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

    //2.3-> other methods
    public  void code(){
        System.out.println(name + " is coding");
    }
    public  void sleep(){
        System.out.println(name + " is sleeping");
    }



}
