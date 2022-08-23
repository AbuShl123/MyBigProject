package CYDEO.days.day34_objectClass;

public class House {

    String type;
    double squareFeet;
    int numberOfBedrooms;
    int numberOfBathRooms;
    boolean inCity;
    boolean hasGarage;

    public double calculateMortgage() {
        if (numberOfBedrooms < 2) {
            return 1500;
        } else if (numberOfBedrooms < 4) {
            return 2000;
        } else {
            return 2050;
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", squareFeet=" + squareFeet +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", numberBathRooms=" + numberOfBathRooms +
                ", inCity=" + inCity +
                ", hasGarage=" + hasGarage +
                '}';
    }
}
