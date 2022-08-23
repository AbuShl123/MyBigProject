package CYDEO.days.day36_customClass.offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true,15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true,15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false,0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false,5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false,0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true,12));
        allOffers.add(new Offer("Deloitte", "Seattle", 170_000, false,0));

        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);

        localOffers.removeIf(offer -> !offer.location.equals("Chicago"));
        System.out.println(localOffers);

        System.out.println("========================");
        System.out.println("Only full time offers: ");
        localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(p -> !p.isFullTime);
        localOffers.forEach(System.out::println);

        System.out.println("\n========================");
        System.out.println("Only full time offers: ");
        localOffers.removeIf(p -> p.salary < 120_000);
        localOffers.forEach(System.out::println);

        // find the biggest and the smallest salary in the whole list
        localOffers = new ArrayList<>(allOffers);
        double min = localOffers.get(0).salary;
        Offer m = localOffers.get(0);
        double max = localOffers.get(0).salary;
        Offer x =  localOffers.get(0);
        for (Offer v : localOffers) {
            if (v.salary > max) {
                max = v.salary;
                x = v;
            }
            if (v.salary < min) {
                min = v.salary;
                m = v;
            }
        }
        System.out.println("\n========================");
        System.out.println("Min salary and biggest salary objects: ");
        System.out.println(m);
        System.out.println(x);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
