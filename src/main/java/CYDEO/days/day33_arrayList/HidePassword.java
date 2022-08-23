package CYDEO.days.day33_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static ArrayList<String> hidePassword(ArrayList<String> arr) {
        ArrayList<String> hidden = new ArrayList<>();

        for (String v : arr) {
            hidden.add(stars(v.length()));
        }

        return hidden;
    }

    public static String stars(int n) {
        return "*".repeat(n);
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Abu", "Shoaliev", "123"));

        System.out.println(hidePassword(arr));
    }
}
