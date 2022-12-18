package day36_Inheritance.Tasks.ScrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO;
    public String BA;
    public String SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> developersList = new ArrayList<>();


    public ScrumTeam(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }


    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTester(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }
    public void removeTester(int ID){
        testersList.remove(ID);
    }
    public void removeDeveloper(int ID){
        developersList.remove(ID);
    }
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testers=" + testersList.size() +
                ", number of developers=" + developersList.size() +
                '}';
    }


}

/*
Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist

				ddTesters(Tester[] testers): adds the given testers to testers arraylist

				removeTester(int id): removes the tester with the given id from the arraylist of tester

				addDeveloper(Developer developer): adds the given developer to testers arraylist

				addDeveloper(Developer[] developer): adds the given developers to testers arraylist

				removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

				toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers
 */
