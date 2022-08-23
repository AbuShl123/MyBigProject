package CYDEO.mentoring.mentoring1408_mathematics.plan;

import java.util.ArrayList;
import java.util.Arrays;

public class Math_plan {
    public static int solve(String str) {
        int x = 0;
        for (String v : getEachVariable(str)) {
            x += Integer.parseInt(v);
        }
        return x;
    }
    public static ArrayList<String> getEachVariable(String str) { // str = "12 + 3 - 10 + 10"
        str = str.replace(" ", "");
        if(!str.startsWith("-")) str = "+" + str;
        String n = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch) && !Character.isAlphabetic(ch))
                n += " ";
            n += ch;
        }
        // n = "12 +3 -10 +10";
        return new ArrayList<>(Arrays.asList(n.trim().split(" ")));
    }
}

