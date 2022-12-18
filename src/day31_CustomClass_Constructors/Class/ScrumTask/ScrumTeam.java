package day31_CustomClass_Constructors.Class.ScrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    //1--> instanceVariables
    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> devopsList = new ArrayList<>();
    public int dayOfSprints;

    //2--> constructor with initializing instanceVariables
    public ScrumTeam(String PO, String BA, String SM, int dayOfSprints){
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprints = dayOfSprints;
    }

    //3--> instanceMethods
    //3.1--> addTester method
    public void  addTester(Tester tester){
        testersList.add(tester);
    }

    //3.2--> addTesters method
    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    //3.3--> addDeveloper method
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }

    //3.4--> addDevelopers method
    public void addDevelopers(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }

    //3.5--> removeTester method
    public void removeTester(int employeeID){
       testersList.removeIf( p -> p.employeeID == employeeID);
    }

    //3.6--> removeDeveloper method
    public void removeDeveloper(int employeeID){
        devopsList.removeIf( p -> p.employeeID == employeeID);
    }

    //3.7--> toString Method
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Total Number of Tester='" + testersList.size() + '\'' +
                ", Total Number of Developer='" + devopsList.size() + '\'' +
                ", dayOfSprints=" + dayOfSprints +
                '}';
    }


}

