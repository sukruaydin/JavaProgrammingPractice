package day31_CustomClass_Constructors.Class.ScrumTask;

public class Tester {

    //1--> instanceVariables
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    //2--> constructor with initializing instanceVariables
    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //3--> instanceMethods
    //3.1--> smokeTesting method
    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

    //3.2--> creatingTicket method
    public void creatingTicket(){
        System.out.println(name + " is creating ticket");
    }

    //3.3--> toString method
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
