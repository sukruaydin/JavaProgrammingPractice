package day36_Inheritance.Tasks.EmployeeTask;

public class Developer extends Employee {

    public void code(){
        System.out.println(name + " is coding");
    }

    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }

}
