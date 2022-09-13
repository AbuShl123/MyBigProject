package CYDEO.days.day43_abstraction.car;

public class Road {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        BMW bmw = new BMW();
        Tesla tesla = new Tesla();

        toyota.start();
        bmw.start();
        tesla.start();
        tesla.charge();
    }
}
