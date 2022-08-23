package CYDEO.days.day13_switch_string;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.next();

        switch (month) {
            case "February":
                System.out.println("28 days"); break;
            case "April":
            case "june":
            case "September":
            case "November":
                System.out.println("30 days"); break;
            case "March":
            case "january":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days"); break;
            default:
                System.out.println("invalid month!!");
        }
    }
}
