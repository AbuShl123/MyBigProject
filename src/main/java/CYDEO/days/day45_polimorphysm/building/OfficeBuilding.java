package CYDEO.days.day45_polimorphysm.building;

public class OfficeBuilding extends Building implements HasElevator{
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for office space");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("We are goign to floor: " + floor);
    }

    @Override
    public String toString() {
        return super.toString() + ", number of floors: " + numberOfFloors;
    }
}
