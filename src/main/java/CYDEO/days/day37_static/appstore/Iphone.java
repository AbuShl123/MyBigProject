package CYDEO.days.day37_static.appstore;

public class Iphone {
    // instance variables
    String model;
    String color;
    double price;
    int storage;

    // static fields
    static String os;
    static String brand;

    // static block used to initialized static variables
    static{
        os = "IOS";
        brand = "Apple";
    }

    public Iphone(String model, String color, double price, int storage) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
