package CYDEO.days.day43_abstraction.learning;

public class AppleStore{
    public static void main(String[] args) {
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        Desktop desktop = new Desktop();
        desktop.turnOn();
        desktop.typing();
    }
}
