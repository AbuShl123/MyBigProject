package CYDEO.days.day45_polimorphysm.building;

public abstract class Building {
    String location;
    double price;

    public Building(String location, double price) {
        this.location = location;
        this.price = price;
    }

    public abstract void pay();

    public String toString() {
        return "location: " + location + ", price: " + price;
    }
}
