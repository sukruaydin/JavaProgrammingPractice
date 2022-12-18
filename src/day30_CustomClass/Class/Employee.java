package day30_CustomClass.Class;

//this is Employee Custom Class
public class Employee {

    //1--> attributes - instanceVariables
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public  int salary;
    public boolean isFullTime;

    //2--> actions - instanceMethods
    //2.1--> creating setInfo method
    public void setInfo(String name, int age, char gender, String jobTitle, int salary, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    //2.2--> toString method
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    //2.3-> other methods
    public void work(){
        System.out.println(name + " is working");
    }


}
