package CYDEO.days.day12_swtich;

import java.util.Scanner;

public class caseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        switch (day) {
            case "monday":
                System.out.println("this is 1 day"); break;
            case "Tuesday":
                System.out.println("This is 2 day"); break;
        }
    }
}
