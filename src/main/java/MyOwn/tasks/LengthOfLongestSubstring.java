package MyOwn.tasks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        ArrayList<String> lons = new ArrayList<>();
        StringBuilder lon = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (lon.toString().contains(s.substring(j,j+1))) {
                    lons.add(lon.toString());
                    lon = new StringBuilder();
                    break;
                }
                lon.append(s.charAt(j));
            }
        }

        System.out.println(lons);

        lons.sort(Comparator.comparingInt(String::length));

        return lons.get(lons.size()-1).length();
    }

    public static int lonSub(String s) {
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int r = 0;
        int l = 0;

        while (r < n) {
            if (!map.containsKey(s.charAt(r))) {
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
                r++;
                count = Math.max(count, r-l);
            } else if (map.containsKey(s.charAt(r))) {
                map.remove(s.charAt(l));
                l++;
            }
        }
        return count;
    }

}
