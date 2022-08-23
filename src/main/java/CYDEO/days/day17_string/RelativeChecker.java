package CYDEO.days.day17_string;

import java.util.Scanner;

public class RelativeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        String s = str.substring(str.indexOf(' '));

        if (str2.endsWith(s)) {
            System.out.println("Related");
        } else {
            System.out.println("Not related");
        }

        System.out.println(str2.endsWith(s) ? "Related" : "Not related");
    }
}
