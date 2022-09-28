package CYDEO.days.day58_maps;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        // System.out.println(Collections.frequency(new ArrayList<>(Arrays.asList(str.split(""))), "a"));


        String str = "applep";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                map.put(letter, map.get(letter)+1);
            }
        }

        System.out.println(map.toString().replaceAll("[\\[{}\\],= ]", ""));
    }
}
