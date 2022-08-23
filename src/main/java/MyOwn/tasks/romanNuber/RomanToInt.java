package MyOwn.tasks.romanNuber;

import java.util.*;

public class RomanToInt {
    public static int romanToInt(String s) {
        List<String> arr = new ArrayList<>(Arrays.asList(s.split("")));
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);

        int result = 0;
        for(int i = 0; i < arr.size()-1; i++){
            String each = arr.get(i);
            String ch = arr.get(i+1);
            int a = roman.get(each);
            int b = roman.get(ch);
            if (a == 1 && (b == 5 || b == 10)) { result += b - a; i++;}
            else if (a == 10 && b == 50 || b == 100) { result += b-a; i++;}
            else result += roman.get(each);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }


}
