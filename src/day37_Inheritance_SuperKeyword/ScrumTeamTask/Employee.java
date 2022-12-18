package day37_Inheritance_SuperKeyword.ScrumTeamTask;

public class Employee extends Person{

    public int ID;
    public String jobTitle;
    public double salary;
    public String companyName;


    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;
    }


    public void work(){
        System.out.println(name + " " + ID + " is working");
    }
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName=" + companyName +
                '}';
    }



}
