package CYDEO.days.day57_itarable;

import org.apache.poi.ss.formula.functions.T;

import java.util.*;

public class LoopingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("December", 12);
        map.put("April", 4);

//      for (: map) only map doesn't work

        for (String key : map.keySet()) { // iterates through a Set of keys
            System.out.println(key);
            System.out.println("value: " + map.get(key));
        }
        System.out.println("map.keySey() = " + map.keySet());
        if (map.keySet() instanceof Set) {
            System.out.println("is instance of Set: " + true);
        }

        System.out.println("-----------------------");
        for (int value : map.values()) { // iterates through all the values
            System.out.println(value);
        }
        System.out.println("map.values() = " + map.values());
        if (map.values() instanceof Collection) {
            System.out.println("is instance of Collection: " + true);
        }

        System.out.println("-----------------------");
        for (Map.Entry<String , Integer> entry : map.entrySet()) { // iterates through all entries
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("map.entrySet() = " + map.entrySet());
    }
}
