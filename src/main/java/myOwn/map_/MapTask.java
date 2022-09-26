package myOwn.map_;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MapTask {
    public static void main(String[] args) {
        System.out.println(countUniques(new int[]{2, 1, 3, 4, 2, 3, 5, 6, 7, 8, 5}));
    }

    public static int countUniques(int[] arr) { // [2, 1, 3, 4, 2, 3, 5, 6, 7, 8, 5]
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer v : arr ){
            if (map.containsKey(v)) map.put(v, map.get(v)+1);
            else map.put(v, 1);
        }
        int count = 0;
        for (Integer v : map.keySet()) {
            if (map.get(v)==1) count++;
        }
        return count;
    }

    public static int countUniques2(int[] arr) { // [2, 1, 3, 4, 2, 3, 5, 6, 7, 8, 5]
        Set<Integer> set = new HashSet<>();
        return 0;
    }


}
