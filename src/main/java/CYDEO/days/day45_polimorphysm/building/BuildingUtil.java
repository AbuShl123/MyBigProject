package CYDEO.days.day45_polimorphysm.building;

public class BuildingUtil {
    public static void main(String[] args) {
        House house1 = new House("Paris", 100_000, 12);
        house1.pay();
        house1.mawlown();

        Building house2 = new House("New York", 2_000_000, 4);
        house2.pay();

        HasBackyard house3 = new House("Seattle", 3_000_000, 5);
        // house3.pay() this is invalid because HasBackyards does not have visibility to this method
        house3.mawlown();

        System.out.println(rent(house1));
        System.out.println(rent(new Apartment("Texas", 12_000, 9)));
        System.out.println(rent(new OfficeBuilding("Great Falls", 1000, 5)));

        System.out.println(search("FairFax"));
    }

    public static double rent(Building building) {
        if (building instanceof House){
            return 1500;
        } else if (building instanceof  Apartment) {
            return 800;
        } else if (building instanceof OfficeBuilding) {
            return 2000;
        }

        return 0;
    }

    public static Building search(String location) {
        switch (location) {
            case "Great Falls":
                return new House("Great Falls", 10_000, 2);
            case "FairFax":
                return new Apartment("FairFax", 1_000, 2);
            case "McLean":
                return new OfficeBuilding("McLean", 9_000_000, 4);
        }

        return null;
    }
}
