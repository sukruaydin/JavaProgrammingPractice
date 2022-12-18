package day36_Inheritance.Tasks.ScrumTeamTask;

public class Developer extends Employee{

    public String programmingLanguage;


    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary,String programmingLanguage) {
        setInfo(name, age, gender, ID, jobTitle, salary);
        this.programmingLanguage = programmingLanguage;
    }


    public void code(){
        System.out.println(name + " is coding");
    }
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +

                '}';
    }



}
/*
Add any extra variable or method that Developer object need to have
 */
