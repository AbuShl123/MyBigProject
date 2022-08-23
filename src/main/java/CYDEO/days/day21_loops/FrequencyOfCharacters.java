package CYDEO.Days.day21_loops;

import java.util.Scanner;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while (str.length() > 0) {
            int counter;
            char tr = str.charAt(0);

            counter = str.length() - str.replace(str.substring(0,1), "").length(); // 1

            System.out.println(tr + " - " + counter);
            str = str.replace(str.substring(0,1), "");
        }
    }
}
