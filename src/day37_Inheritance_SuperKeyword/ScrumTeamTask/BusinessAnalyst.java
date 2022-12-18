package day37_Inheritance_SuperKeyword.ScrumTeamTask;

public class BusinessAnalyst extends Employee{


    public BusinessAnalyst(String name, int age, char gender, int ID, double salary, String companyName) {
        super(name, age, gender, ID, "Business Analyst", salary, companyName);
    }


    public void analyze(){
        System.out.println(name + " is analyzing");
    }


}
