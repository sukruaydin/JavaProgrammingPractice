package day36_Inheritance.Tasks.SportTask;

public class Basketball extends Sport{

    public int numberOfPeriods;


    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules, int numberOfPeriods) {
        setInfo(name, numberOfPlayers, numberOfReferee, rules);
        this.numberOfPeriods = numberOfPeriods;
    }


    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                ", numberOfPeriods=" + numberOfPeriods +
                '}';
    }



}
