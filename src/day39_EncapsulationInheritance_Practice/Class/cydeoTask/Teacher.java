package day39_EncapsulationInheritance_Practice.Class.cydeoTask;

public class Teacher extends Employee{


    public Teacher(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }


}
