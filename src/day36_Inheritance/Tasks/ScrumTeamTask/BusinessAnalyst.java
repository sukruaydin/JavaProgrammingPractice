package day36_Inheritance.Tasks.ScrumTeamTask;

public class BusinessAnalyst extends Employee{

    public boolean hasISTQB;


    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary, boolean hasISTQB) {
        setInfo(name, age, gender, ID, jobTitle, salary);
        this.hasISTQB = hasISTQB;
    }


    public void help(){
        System.out.println(name + " helping PO");
    }
    public String toString() {
        return "BusinessAnalyst{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hasISTQB=" + hasISTQB +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }



}
/*
Add any extra variable or method that BusinessAnalyst object need to have
 */
