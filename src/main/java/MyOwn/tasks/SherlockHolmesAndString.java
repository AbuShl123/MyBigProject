package MyOwn.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SherlockHolmesAndString {
    public static String SherlockString(String str) {
        List<Integer> counter = new ArrayList<>();
        int count = 0;
        for (int i = 'a'; i < 'z'; i++) {
            int let = str.length() - str.replaceAll(
                    String.valueOf((char) i), "").length();
            if (let == 0) continue;
            counter.add(let);
            System.out.println(counter.get(count)); count++;
        }
        count = 0;
        for (int i = 0; i < counter.size()-1; i++) {
            if (!Objects.equals(counter.get(i), counter.get(i + 1))) count++;
        }
        if (count > 1) return "NO";
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(SherlockString("aabbcd"));
    }
}
