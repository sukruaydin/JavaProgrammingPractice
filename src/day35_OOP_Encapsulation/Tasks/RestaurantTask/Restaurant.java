package day35_OOP_Encapsulation.Tasks.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    private String owner, location;
    private int numberOfStars;
    private ArrayList<Server> serverList = new ArrayList<>();
    private ArrayList<Chef> chefList = new ArrayList<>();


    public String getOwner() {
        return owner;
    }
    public String getLocation() {
        return location;
    }
    public int getNumberOfStars() {
        return numberOfStars;
    }
    public ArrayList<Server> getServerList() {
        return serverList;
    }
    public ArrayList<Chef> getChefList() {
        return chefList;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setNumberOfStars(int numberOfStars) {
        if (numberOfStars<0){
            System.err.println("Number of stars can NOt be negative");
            System.exit(0);
        }
        this.numberOfStars = numberOfStars;
    }
    public void setServerList(ArrayList<Server> serverList) {
        this.serverList = serverList;
    }
    public void setChefList(ArrayList<Chef> chefList) {
        this.chefList = chefList;
    }


    public Restaurant(String owner, String location, int numberOfStars) {
        setOwner(owner);
        setLocation(location);
        setNumberOfStars(numberOfStars);
    }


    public void hireServer(Server server){
        serverList.add(server);
    }
    public void hireServer(Server[] servers){
        serverList.addAll(Arrays.asList(servers));
    }
    public void hireChef(Chef chef){
        chefList.add(chef);
    }
    public void hireChef(Chef[] chefs){
        chefList.addAll(Arrays.asList(chefs));
    }
    public void terminateServer(int employeeID){
        serverList.remove(employeeID);
    }
    public void terminateChef(int employeeID){
        chefList.remove(employeeID);
    }
    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", number of servers=" + serverList.size() +
                ", number of chefs=" + chefList.size() +
                '}';
    }



}
