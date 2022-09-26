package myOwn.map_;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapWorking1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Abu");
        map.put(2, "Bekhruz");
        map.put(3, "Mahummadali");
        map.put(4, "Umid");
        map.put(5, "Shaxboz");

        System.out.println(map);

        System.out.println("---------------------------");

        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::print);
    }
}
