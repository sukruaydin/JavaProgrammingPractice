package day32_CustomClass_Constructor2;

public class FurkanFriends {

    //1--> instanceVariables
    public String name;
    public int age;

    //2--> constructor
    public FurkanFriends(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3--> instanceMethods
    //3.1--> ageMultiply2 method
    public double ageMultiply2(){
        return age * 2;
    }

    //3.2--> toString method
    public String toString() {
        return "furkan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", age time 2 =" + ageMultiply2() +
                '}';
    }
}
