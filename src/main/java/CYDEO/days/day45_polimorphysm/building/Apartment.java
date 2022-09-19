package CYDEO.days.day45_polimorphysm.building;

public class Apartment extends Building implements HasBalcony {

    int monthOfLease;

    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying the rent for apartment");
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening door for the balcony");
    }

    @Override
    public String toString() {
        return super.toString() + ", month of lease: " + monthOfLease;
    }
}
