package CYDEO.days.day58_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");
        person1.put("ADDRESS", "131 Park Drive, London");
        System.out.println("person1.get(\"FIRST_NAME\") = " + person1.get("FIRST_NAME"));

        Map<String, String> person2 = new HashMap<>();
        person2.put("FIRST_NAME", "Abu");
        person2.put("LAST_NAME", "Shoaliev");
        person2.put("AGE", "17");
        person2.put("ADDRESS", "Pr.R.105B, Almaty");

        List<Map<String, String>> listOfPeople = new ArrayList<>(List.of(person1, person2));
        listOfPeople.add(Map.of("FIRST_NAME", "Anna", "LAST_NAME", "JONES", "AGE", "30", "ADDRESS", "2313 Tucker Avenue"));

        System.out.println(listOfPeople); // the whole ArrayList of maps
        System.out.println(listOfPeople); // gets the first element from the ArrayList
        System.out.println(listOfPeople.get(1).get("ADDRESS"));
        System.out.println(listOfPeople.get(2).get("FIRST_NAME"));
        System.out.println(listOfPeople.get(2).values());

        // TC: verify that all the users in db are unique
        // TC: verify that the information displayed in UI matches to DB.
        // TC: AGE should not be empty.

        for (Map<String, String> v : listOfPeople) {
            if (v.get("AGE") == null) {
                System.out.println("FAIL");
            }
        }
    }
}
