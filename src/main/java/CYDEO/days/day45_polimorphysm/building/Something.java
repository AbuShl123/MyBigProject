package CYDEO.days.day45_polimorphysm.building;

import java.util.ArrayList;

public class Something {
    public static void main(String[] args) {
        ArrayList<Building> allBuildings = new ArrayList<>();
        allBuildings.add(new House("Texsa", 12_000_000, 2));
        allBuildings.add(new Apartment("New York", 20_000_000, 1));
        allBuildings.add(new OfficeBuilding("Virgina", 100_000_000, 20));
        allBuildings.add(BuildingUtil.search("Great Falls"));
        allBuildings.add(BuildingUtil.search("McLean"));

        Building mostExpensive = allBuildings.get(0); // just a default value

        for (Building building : allBuildings) {
            if (building.price > mostExpensive.price)
                mostExpensive = building;
        }

        System.out.println(mostExpensive);

        //mostExpensive.numberOfFloors; // this does not compile because the reference is Builder but Builder does not have visibility to the variable

        System.out.println(((OfficeBuilding) mostExpensive).numberOfFloors);

        ArrayList<Building> filteredBuildings = new ArrayList<>(allBuildings);
        Building finalMostExpensive = mostExpensive;
        filteredBuildings.removeIf(e -> e.price >= finalMostExpensive.price || e.price < 12_000_000);
        System.out.println(filteredBuildings);
    }
}

