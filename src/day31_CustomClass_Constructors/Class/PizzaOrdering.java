package day31_CustomClass_Constructors.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzaList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza smallPizza = new Pizza('S',2,3);
            Pizza mediumPizza = new Pizza('M',3,4);
            Pizza largePizza = new Pizza('L',4,5);

            pizzaList.addAll(Arrays.asList(smallPizza,mediumPizza,largePizza));
        }
        System.out.println("Total number of pizza: " + pizzaList.size());


        int total = 0;
        for (Pizza each : pizzaList) {
            total += each.calcCost();
        }

        System.out.println("total price = $" + total);


    }


}
