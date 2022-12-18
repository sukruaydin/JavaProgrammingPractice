package day31_CustomClass_Constructors.Class.ScrumTask;

public class Developer {

    //1--> instanceVariables
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    //2--> constructor with initializing instanceVariables
    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    //3--> instanceMethods
    //3.1--> coding method
    public void coding(){
        System.out.println(name + " is coding");
    }

    //3.2--> unitTesting method
    public void unitTesting(){
        System.out.println(name + " is doing unit testing");
    }

    //3.3--> fixingBug method
    public void  fixingBug(){
        System.out.println(name + " is fixing bugs");
    }

    //3.4--> toString method
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }



}
