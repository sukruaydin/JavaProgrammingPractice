package day36_Inheritance.Tasks.SportTask;

public class Sport {

    public String name;
    public int numberOfPlayers;
    public int numberOfReferee;
    public String rules;


    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.numberOfReferee = numberOfReferee;
        this.rules = rules;
    }


    public void play(){
        System.out.println(name + " is being played");
    }
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }


}

/*
Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules

			methods:
				setInfo()
				play()
				toString()

		2. create the following sub classes of Sport:
				1. Basketball
				2. Baseball
				3. Football
				4. AmericanFootball

			Add any missing variables or methods

			Note: you can search them on google

 */
