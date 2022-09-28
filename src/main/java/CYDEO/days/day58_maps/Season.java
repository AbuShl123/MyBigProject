package CYDEO.days.day58_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class Season {
    public static void main(String[] args) {
        // avg temp each season
        Map<String, Double> map = new HashMap<>();
        map.put("summer", 85.0);
        map.put("fall", 65.2);
        map.put("winter", 32.5);
        map.put("spring", 65.2);
        System.out.println(map);

        map.put("winter", 30.1);
        System.out.println(map);

        System.out.println("average for winter: " + map.get("winter"));
        System.out.println("average for spring: " + map.get("spring"));

        System.out.println("map.containsKey(\"summer\") = " + map.containsKey("summer"));
        System.out.println("map.containsValue(65.2) = " + map.containsValue(65.2));

        System.out.println(map.values());
        int before = map.values().size();
        int after = new HashSet<>(map.values()).size();
        if (before == after){
            System.out.println("no duplicates");
        } else {
            System.out.println("There were duplicates");
        }
            // find average temp for each season


        AtomicReference<Double> averageAtomic = new AtomicReference<>((double) 0);
        map.values().forEach(e -> averageAtomic.updateAndGet(v -> ((v + e))));
        double average = averageAtomic.get() / map.values().size();
        System.out.println(average);
        System.out.println(getAvgTemp(map));

    }

    public static double getAvgTemp(Map<String, Double> map) {
        double average = 0;

        for (double v : map.values()) {
            average+=v;
        }

        return average/map.values().size();
    }
}
