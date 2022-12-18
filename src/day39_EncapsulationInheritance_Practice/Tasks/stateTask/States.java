package day39_EncapsulationInheritance_Practice.Tasks.stateTask;

public class States {

    private String name, abbreviation, politicalParty, Governor, senator;
    private int population;
    private double stateTax;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can NOT be null");
            System.exit(1);
        }
        if (name.isEmpty() || name.isBlank()){
            System.err.println("Name can NOT be empty");
            System.exit(1);
        }
        this.name = name;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null){
            System.err.println("Abbreviation can NOT be null");
            System.exit(1);
        }
        if (abbreviation.isEmpty() || abbreviation.isBlank()){
            System.err.println("Abbreviation can NOT be empty");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }
    public String getPoliticalParty() {
        return politicalParty;
    }
    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null){
            System.err.println("Political Party can NOT be null");
            System.exit(1);
        }
        if (politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Political Party can NOT be empty");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }
    public String getGovernor() {
        return Governor;
    }
    public void setGovernor(String governor) {
        if (getGovernor() == null){
            System.err.println("Governor can NOT be null");
            System.exit(1);
        }
        if (governor.isEmpty() || governor.isBlank()){
            System.err.println("Governor can NOT be empty");
            System.exit(1);
        }
        Governor = governor;
    }
    public String getSenator() {
        return senator;
    }
    public void setSenator(String senator) {
        if (senator == null){
            System.err.println("Senator can NOT be null");
            System.exit(1);
        }
        if (senator.isEmpty() || senator.isBlank()){
            System.err.println("Senator can NOT be empty");
            System.exit(1);
        }
        this.senator = senator;
    }
    public int getPopulation() {
        return population;
    }
    public void setPopulation(int population) {
        if (population<=0){
            System.err.println("Invalid population:"+population);
            System.exit(1);
        }
        this.population = population;
    }
    public double getStateTax() {
        return stateTax;
    }
    public void setStateTax(double stateTax) {
        if (stateTax<0){
            System.err.println("Invalid state tax:"+stateTax);
            System.exit(1);
        }
        this.stateTax = stateTax;
    }


    public States(String name, String abbreviation, String politicalParty, String governor, String senator,
                    int population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }


    @Override
    public String toString() {
        return "States{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
