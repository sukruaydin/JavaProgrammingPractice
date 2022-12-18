package day38_Inheritance_MethodOverriding.Tasks.employeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, int age, int ID, char gender, double salary, String companyName) {
        super(name, jobTitle, age, ID, gender, salary, companyName);
    }


    @Override
    public void work() {
        System.out.println(name + " is writing codes");
    }


}
