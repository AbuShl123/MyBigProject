package CYDEO.days.day45_polimorphysm.building;

public class House extends Building implements HasBackyard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("paying the mortgage");
    }

    @Override
    public void mawlown() {
        System.out.println("Mowing the lawn in the backyard");
    }

    public String toString() {
        return super.toString() + ", number of residents: " + numberOfResidents;
    }
}
