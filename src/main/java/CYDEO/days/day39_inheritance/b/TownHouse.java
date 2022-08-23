package CYDEO.days.day39_inheritance.b;

import CYDEO.days.day39_inheritance.a.House;

public class TownHouse extends House {
    public static void main(String[] args) {
        //q: What does TownHouse inherit from House

        // in different packages

        TownHouse house = new TownHouse();

        house.address = "123 road";

        house.city = "Virginia";
        // did I inherit this city variable? yes

        //house.state is default so accessible in the same package
        //house.zipcode is private so accessible in the same class
    }
}
