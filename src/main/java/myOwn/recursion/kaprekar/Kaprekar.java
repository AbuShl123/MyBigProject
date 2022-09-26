package myOwn.recursion.kaprekar;

import java.util.*;
import java.util.stream.Collectors;

public class Kaprekar {
/*
    public static int[] sort(int a) { // 4500
        String s = String.valueOf(a);



        if (s.length() < 4) s += "0".repeat(4 - s.length());
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            num.add(Integer.parseInt(s.substring(i,i+1)));
        }
        List<Integer> sorting = num.stream().sorted().collect(Collectors.toList()); // 1, 2, 3. 4
        a = 0;
        int d = 1000;
        for (int i : sorting) {
            a += i*d;
            d /= 10;
        }
        // a = 1234
        StringBuilder bu = new StringBuilder(String.valueOf(a));
        s = bu.reverse().toString();
        if (s.length() < 4) s += "0".repeat(4 - s.length());
        return new int[]{a, Integer.parseInt(s)};
    }


    static int count = 0;
    public static int kaprekar(int num) { // 1234
        int[] s = sort(num);
        int x = s[1] - s[0];
        count++;
        if (x == 6174) return count;
        return kaprekar(x);
    }
*/

    static int count;
    public static int kaprekar(int num) {
        String s = String.valueOf(num);
        s += "0".repeat(4 - s.length());
        String z = String.valueOf(
                Arrays.stream(            s.split(""))
                        .sorted().collect(Collectors.toList())
        ).replaceAll("[\\[\\] ,]", "");
        StringBuilder b = new StringBuilder(z).reverse();
        num = Integer.parseInt(String.valueOf(b)) - Integer.parseInt(z);
        count++;
        if (num != 6174) kaprekar(num);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(kaprekar(456));
    }
}
