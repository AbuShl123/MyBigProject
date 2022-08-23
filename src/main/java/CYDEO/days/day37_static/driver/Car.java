package CYDEO.days.day37_static.driver;

public class Car {

    String model;
    Driver driver;

    // when i call the Car constructor, the code inside is calling the dDriver constructor
    public Car(String model, String name, long licenceNumber, char licenceType) {
        this.model = model;
        driver = new Driver(name, licenceNumber, licenceType); // creating a Driver object
    }

    public Car (String model, Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", driver=" + driver +
                '}';
    }
}
