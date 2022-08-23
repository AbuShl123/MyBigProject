package CYDEO.days.day34_objectClass;

public class Market {
    public static void main(String[] args) {
        House house1 = new House();
        System.out.println(house1);

        house1.type = "Townhouse";
        house1.squareFeet = 1200;
        house1.numberOfBedrooms = 2;
        house1.numberOfBathRooms = 3;
        house1.inCity = false;
        house1.hasGarage = true;

        System.out.println(house1); // don't need to call toString because it's automatically called

        System.out.println(house1.calculateMortgage());
    }
}
