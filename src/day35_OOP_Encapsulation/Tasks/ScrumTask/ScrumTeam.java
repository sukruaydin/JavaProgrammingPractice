package day35_OOP_Encapsulation.Tasks.ScrumTask;


import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO;
    private String BA;
    private String SM;
    private ArrayList<Tester> testersList = new ArrayList<>();
    private ArrayList<Developer> devopsList = new ArrayList<>();
    private int dayOfSprints;


    public String getPO() {
        return PO;
    }
    public String getBA() {
        return BA;
    }
    public String getSM() {
        return SM;
    }
    public ArrayList<Tester> getTestersList() {
        return testersList;
    }
    public ArrayList<Developer> getDevopsList() {
        return devopsList;
    }
    public int getDayOfSprints() {
        return dayOfSprints;
    }
    public void setPO(String PO) {
        this.PO = PO;
    }
    public void setBA(String BA) {
        this.BA = BA;
    }
    public void setSM(String SM) {
        this.SM = SM;
    }
    public void setTestersList(ArrayList<Tester> testersList) {
        this.testersList = testersList;
    }
    public void setDevopsList(ArrayList<Developer> devopsList) {
        this.devopsList = devopsList;
    }
    public void setDayOfSprints(int dayOfSprints) {
        if (dayOfSprints<=0){
            System.err.println("Sprint days can NOT be zero or negative");
            System.exit(0);
        }
        this.dayOfSprints = dayOfSprints;
    }


    public ScrumTeam(String PO, String BA, String SM, int dayOfSprints) {
        setPO(PO);
        setBA(BA);
        setSM(SM);
        setDayOfSprints(dayOfSprints);
    }


    public void addTester(Tester tester){
        testersList.add(tester);
    }
    public void addTester(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        devopsList.add(developer);
    }
    public void addDeveloper(Developer[] developers){
        devopsList.addAll(Arrays.asList(developers));
    }
    public void removeTester(Tester tester){
        testersList.remove(tester);
    }
    public void removeDeveloper(Developer developer){
        devopsList.remove(developer);
    }
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", Number of Testers=" + testersList.size() +
                ", Number of Developers=" + devopsList.size() +
                ", dayOfSprints=" + dayOfSprints +
                '}';
    }


}
