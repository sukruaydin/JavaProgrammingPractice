package day37_Inheritance_SuperKeyword.ScrumTeamTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, ID, jobTitle, salary, companyName);
    }


    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


}
