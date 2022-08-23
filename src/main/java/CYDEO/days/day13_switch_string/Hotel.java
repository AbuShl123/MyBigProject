package CYDEO.days.day13_switch_string;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the java hotel!");
        System.out.println("How many days will you be staying?");
        int days = sc.nextInt();
        System.out.println("How many people do you have at the party?");
        int people = sc.nextInt();

        String roomType = "";
        double price = 0;

        switch (people) {
            case 1:
                roomType = "single room";
                price = days * 100;

                break;
            case 2:
                roomType = "double room";
                price = days * 125;
                break;
            case 3:
            case 4:
                roomType = "large room";
                price = days * people * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = "suite";
                price = days * 5000;
                break;
            default:
                System.out.println("Go away, we don't serve you.");
        }

        if (people <= 7) {
            System.out.println("party size: " + people);
            System.out.println("room type: " + roomType);
            System.out.println("price: $" + price);
        }
    }
}
