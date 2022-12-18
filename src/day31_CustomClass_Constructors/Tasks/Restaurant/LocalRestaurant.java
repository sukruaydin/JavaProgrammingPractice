package day31_CustomClass_Constructors.Tasks.Restaurant;

import java.util.ArrayList;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Hale Nur Aydın","Güneşli",4);

        Server server1 = new Server("Ahmet",11,20,true);
        Server server2 = new Server("Mehmet",12,18,false);
        Server server3 = new Server("Cemal",13,22,true);
        Server server4 = new Server("Cevdet",14,16,true);
        Server[] servers = {server1,server2,server3,server4};

        Chef chef1 = new Chef("Alpha",21,32,false);
        Chef chef2 = new Chef("Bravo",22,30,false);
        Chef chef3 = new Chef("Charlie",23,42,true);
        Chef[] chefs = {chef1,chef2,chef3};

        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);

        System.out.println("restaurant1 = " + restaurant1);

        System.out.println("-------------------------------------");

        //print the names of servers
        for (Server server : restaurant1.serverList) {
            System.out.println(server.name);
        }

        System.out.println("-------------------------------------");

        //print the name of full-timers chefs
        ArrayList<Chef> fullTimer = new ArrayList<>(restaurant1.chefList);
        fullTimer.removeIf( p -> !p.fullTime);
        for (Chef chef : fullTimer) {
            System.out.println(chef.name);
        }

    }

}
