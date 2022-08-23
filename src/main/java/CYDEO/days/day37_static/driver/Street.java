package CYDEO.days.day37_static.driver;

import java.util.ArrayList;
import java.util.List;

public class Street {
    public static void main(String[] args) {
        Car obj1 = new Car("BWM", "Abu", 11012110201L, 'A');
        System.out.println(obj1.driver);
        System.out.println(obj1.driver.name);
        System.out.println(obj1.driver.licenceNumber);

        Driver driver = new Driver("Abu", 11012110201L, 'A');
        Car obj2 = new Car("Mercedes", driver);
        System.out.println(obj2);

        Car obj3 = new Car("Tayota", new Driver("Amin", 11101101L, 'B'));

        Driver driver1 = new Driver("Johns", 12121201, 'S');
        Car obj4 = new Car("H-12", driver1);

        ArrayList<Car> cars = new ArrayList<>(List.of(obj1, obj2, obj3, obj4));

        System.out.println(cars);

    }
}
