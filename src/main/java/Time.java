import CYDEO.days.day40_inheritance.shape.Test;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Time {
    public static void main(String[] args) {
        System.out.println(eachCharacter("aaabbbcc"));
        System.out.println(eachChars("aaaabbbcccdd"));
    }

    public static String eachCharacter(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String let = str.substring(i,i+1);
            if (map.containsKey(let)) {
                map.put(let, map.get(let)+1);
                continue;
            }
            map.put(let, 1);
        }
        String result = "";
        for (String key : map.keySet()) {
            result += map.get(key) + key;
        }
        return result;
    }

    public static String countLetters(String str){
        String res = "";
        while (str.length() != 0) {
            String let = str.substring(0,1);
            int c = str.length();
            str = str.replace(let, "");
            c -= str.length();
            res += c + let;
        }
        return res;
    }

    public static String eachChars(String str) {
        List<String> list6 = Arrays.stream(str.split("")).collect(Collectors.toList());
        String a = "";
        for (String each1 : list6){
            if (!a.contains(each1)){
                a += list6.stream().filter(p -> p.toLowerCase().contains(each1)).count();
                a += each1;
            }

        }
        return a;
    }
}





