package CYDEO.Days.day20_loops;

import java.util.Locale;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "AbUbaKr291";
        int upper = 0, lower = 0, number = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);

            if (eachLetter>= 'A' && eachLetter <= 'Z') upper++;
            else if (eachLetter>= 'a' && eachLetter <= 'z') lower++;
            else if (eachLetter >= '0' && eachLetter <= '9') number++;
        }

        System.out.println(upper + " uppercase letters");
        System.out.println(lower + " lowercase letters");
        System.out.println(number + " numbers");
    }
}
