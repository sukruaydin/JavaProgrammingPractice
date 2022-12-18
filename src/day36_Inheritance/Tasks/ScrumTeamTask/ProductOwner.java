package day36_Inheritance.Tasks.ScrumTeamTask;

public class ProductOwner extends Employee{

    public int experience;


    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary,int experience) {
        setInfo(name, age, gender, ID, jobTitle, salary);
        this.experience = experience;
    }


    public String toString() {
        return "ProductOwner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", experience=" + experience +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +

                '}';
    }




}
/*
Add any extra variable or method that ProductOwner object need to have
 */
