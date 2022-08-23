package CYDEO.days.day15_String;

import java.util.Scanner;

public class ValidWebsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean b1 = str.startsWith("www.");
        boolean b2 = str.endsWith(".com") || str.endsWith(".edu") || str.endsWith(".gov") || str.endsWith(".net");

        if (b1 && b2) {
            System.out.println(str + " is valid");
        } else {
            System.out.println("Invalid website");
            if (!b1) System.out.println("website should start with www.");
            if (!b2) System.out.println("Website should end with correct domen");
        }
    }
}
