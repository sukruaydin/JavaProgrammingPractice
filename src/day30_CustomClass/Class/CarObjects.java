package day30_CustomClass.Class;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        //1--> creating the object
        Car car1 = new Car();

        //2--> calling instanceVariables
        car1.setInfo("Audi","A3","Black",2015,500_000);
        System.out.println("car1 = " + car1);


        Car car2 = new Car();
        car2.setInfo("Seat","Leon","White",2011,250_000);
        System.out.println("car2 = " + car2);


        Car car3 = new Car();
        car3.setInfo("Opel","Astra","Gray",2006,150_00);
        System.out.println("car3 = " + car3);

        /*Car[] cars = {car1, car2, car3};
        System.out.println(Arrays.toString(cars));*/

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));
        System.out.println("carsList = " + carsList);

        //print out each car's brand and price
        for (Car each : carsList) {
            System.out.println(each.brand + " " + each.model + " : " + each.price);
        }


        //let's say, Audi 2005~2008 and Opel 1995~1997 models will be called, so we need to remove them from the list

        carsList.removeIf( p -> p.brand.equals("Audi") && (p.year>=2005 && p.year<=2008));
        carsList.removeIf( p -> p.brand.equals("Opel") && (p.year>=1995 && p.year<=1997));


    }

}
