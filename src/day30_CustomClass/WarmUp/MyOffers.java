package day30_CustomClass.WarmUp;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("USA","Cydeo","SDET",120_000,true,true,true,true);
        offer2.setInfo("USA","Ford","Developer",80_000,false,true,true,false);
        offer3.setInfo("Britain","Shell","Caretaker",40_000,false,false,false,true);
        offer4.setInfo("Wales","RoyalAirForce","Pilot",300_000,true,false,false,false);
        offer5.setInfo("Germany","Audi","SDET",95_000,true,true,true,false);
        offer6.setInfo("Italy","Ferrari","CarWash",75_000,false,true,false,true);
        offer7.setInfo("Turkey","KoçHolding","SDET",126_000,true,true,true,false);

        //collecting them together into one array
        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        //find full time offers
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        fullTimeOffers.removeIf( p -> !p.fullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers);
        System.out.println("---------------------------------------------------");

        //find the numbers of offers from USA
        ArrayList<Offer> fromUSA = new ArrayList<>(Arrays.asList(myOffers));
        fromUSA.removeIf( p -> !p.location.equals("USA"));
        System.out.println("how many offers from USA = " + fromUSA.size());
        for (Offer each : fromUSA) {
            System.out.println(each.companyName + " : " + each.salary);
        }
        System.out.println("---------------------------------------------------");

        //find beneficial ones
        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offersWithBenefits.removeIf(p -> !(p.hasBenefit && p.hasPTO));
        System.out.println("offersWithBenefits = " + offersWithBenefits);
        System.out.println("---------------------------------------------------");

        //find SDET ones
        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> !p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers = " + sdetOffers);
        System.out.println("---------------------------------------------------");

        //find offers with 100K or more
        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100K.removeIf(p -> p.salary < 100_000);
        System.out.println("offersWith100K = " + offersWith100K);


    }

}
