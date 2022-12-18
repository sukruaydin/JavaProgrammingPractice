package day35_OOP_Encapsulation.Tasks.Candies;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        ArrayList<Candy> list = new ArrayList<>();

        Candy candy1 = new Candy("tadelle",2,8,false);
        Candy candy2 = new Candy("çokonat",1,3,true);
        Candy candy3 = new Candy("metro",2,8,false);
        Candy candy4 = new Candy("snickers",4,10,true);
        Candy candy5 = new Candy("damak",3,5,false);

        list.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy : list) {
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }



    }

}
