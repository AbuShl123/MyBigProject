package CYDEO.days.day43_abstraction.learning;

public interface Mac {

    String brand = "Apple";
    String os = "IOS";

    void turnOn();

    static void getBrand() {
        System.out.println("The brand is Apple");
    }

    default void typing() {
        System.out.println("typing on mac keyword");
    }
}
