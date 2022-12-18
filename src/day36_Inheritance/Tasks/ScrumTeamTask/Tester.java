package day36_Inheritance.Tasks.ScrumTeamTask;

public class Tester extends Employee{

    public boolean isFunctional;


    public void setInfo(String name, int age, char gender, int ID, String jobTitle, double salary,boolean isFunctional) {
        setInfo(name, age, gender, ID, jobTitle, salary);
        this.isFunctional = isFunctional;
    }


    public void test(){
        System.out.println(name + " is testing");
    }
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isFunctional=" + isFunctional +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +

                '}';
    }



}
/*
Add any extra variable or method that Tester object need to have
 */
