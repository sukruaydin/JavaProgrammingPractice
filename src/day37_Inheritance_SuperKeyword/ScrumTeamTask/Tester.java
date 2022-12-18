package day37_Inheritance_SuperKeyword.ScrumTeamTask;

public class Tester extends Employee{


    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }


    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket");
    }



}
