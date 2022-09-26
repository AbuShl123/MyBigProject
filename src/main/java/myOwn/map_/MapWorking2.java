package myOwn.map_;



import java.util.*;
import java.util.stream.Collectors;

public class MapWorking2 {
    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        List<String> l = new ArrayList<>(Arrays.asList(strings));
        Set<String> noRep = new HashSet<>(l);
        for (String v : noRep) {
            int len = l.size();
            l.removeAll(Collections.singleton(v));
            map.put (
                    v, len - l.size()
            );
        }
        return map;
    }


    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String v : strings) {
            String value =
                    Arrays.stream(strings).filter(x -> x.charAt(0) == v.charAt(0))
                            .collect(Collectors.toList()).toString();
            value = value.replaceAll("[, ]", "");
            map.put(v.substring(0,1), value.substring(1, value.length()-1));
        }
        return map;
    }



    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "Abu");
        map.put("I", "Imona");
        map.put("K", "Komron");
        map.put("N", "Nargiza");
        System.out.println(map);
        System.out.println(map.keySet());
        for (String a : map.keySet()) {
            System.out.println(a);
        }


        String[] str = {"a", "b", "aAA", "c", "bBb"};
        System.out.println(firstChar(str));


    }
}
