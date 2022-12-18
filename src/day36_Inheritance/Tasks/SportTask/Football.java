package day36_Inheritance.Tasks.SportTask;

public class Football extends Sport{

    public boolean isChampionsLeague;


    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules, boolean isChampionsLeague) {
        setInfo(name, numberOfPlayers, numberOfReferee, rules);
        this.isChampionsLeague = isChampionsLeague;
    }


    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                ", isChampionsLeague=" + isChampionsLeague +
                '}';
    }


}
