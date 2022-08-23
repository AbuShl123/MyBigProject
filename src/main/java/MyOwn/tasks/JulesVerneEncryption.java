package MyOwn.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JulesVerneEncryption {

    public static String encrypt(String str) {
        str = str.replace(" ", "");
        int c = (int)Math.ceil(Math.sqrt(str.length()));
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < str.length(); i+=c) {
            try {
                arr.add(str.substring(i,i+c));
            } catch (Exception e) { arr.add(str.substring(i));}
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < c; i++) {
            for (String s : arr) {
                if (i > s.length()-1) continue;
                result.append(s.charAt(i));
            }
            result.append(" ");
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(encrypt("chill out"));
    }
}
