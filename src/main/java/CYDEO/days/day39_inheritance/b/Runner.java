package CYDEO.days.day39_inheritance.b;

public class Runner {
    public static void main(String[] args) {
        //q: What does TownHouse inherit from House

        // in different packages

        TownHouse house = new TownHouse();

        house.address = "123 road";

        // house.city = "Virginia";
        // no accessible outside the package

        //house.state is default so accessible in the same package
        //house.zipcode is private so accessible in the same class
    }
}
