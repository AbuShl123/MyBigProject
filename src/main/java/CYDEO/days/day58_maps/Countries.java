package CYDEO.days.day58_maps;

import java.util.*;
import static myOwn.utilites.classRECOURSE.*;

public class Countries {
    public static void main(String[] args) {
        // key - countries - string
        // value - cities - List of Strings =>  List<String>

        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(
                List.of("Chicago", "Dallas", "Irvine", "San-Diego", "New York", "Philadelphia", "Madison")
        ));
        // Arrays.asList() --> immutable List

        System.out.println(countries.get("United States"));
        countries.get("United States").add("Seattle");
        System.out.println(countries.get("United States"));
        System.out.println(countries.get("United States").get(2));
        System.out.println(countries);
        System.out.println("-------------------------------");

        countries.put("Europe", new ArrayList<>(
                List.of("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid"))
        );

        countries.put("Uzbekistan", new ArrayList<>(
                List.of("Tashkent", "Samarkand", "Bukhara", "Fergana", "Urgench", "Khiva", "Bakht")
        ));

        countries.put("Kazakhstan", new ArrayList<>(
                List.of("Petropavlovsk", "Astana", "Almaty", "Aktobe", "Kokshetau")
        ));

        for ( Map.Entry<String, List<String>> a : countries.entrySet()){
            System.out.println(GREEN_BOLD + a.getKey() + RESET + " = " + a.getValue());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat country are you going to tour? \n" + countries.keySet());
        String country = sc.nextLine();
        for (String city : countries.get(country)) { // iterate through each city of a specific country
            System.out.println("Touring.... " + YELLOW_BRIGHT + city + RESET);
        }

        System.out.println("------------------------------");

        for (Map.Entry<String, List<String>> entry : countries.entrySet()) {
            for (String city : entry.getValue()){
                if (city.startsWith("A") || city.endsWith("a"))
                    System.out.println(city);
            }
        }


    }
}
