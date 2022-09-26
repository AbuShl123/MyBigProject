package CYDEO.days.day57_itarable;

import java.util.*;

public class RemoveLength {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "java", "hello", "world", "automation", "soft skills", "lunch"));

        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            if (it.next().length() <= 4) it.remove();
        }
        System.out.println(words);

        System.out.println(new TreeSet<>(words));
    }
}
