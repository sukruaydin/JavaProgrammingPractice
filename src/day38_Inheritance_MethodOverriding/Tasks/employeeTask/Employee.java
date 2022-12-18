package day38_Inheritance_MethodOverriding.Tasks.employeeTask;

public class Employee {

    public String name, jobTitle;
    public int age, ID;
    public char gender;
    public double salary;
    public String companyName;


    public Employee(String name, String jobTitle, int age, int ID, char gender, double salary, String companyName) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
        this.companyName = companyName;
    }


    public void work(){

    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", gender=" + gender +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }


}
