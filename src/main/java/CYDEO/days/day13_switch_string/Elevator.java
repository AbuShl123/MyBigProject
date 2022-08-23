package CYDEO.days.day13_switch_string;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner floor = new Scanner(System.in);
        System.out.println("Click the number: ");
        int elevator = floor.nextInt();

        String companies;

        switch (elevator) {
            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break; //stops the switch
            case 2:
                companies = "NASA, Cydeo, Discover";
                break;
            case 3:
                companies = "Uber, Lyft, Chase";
                break;
            case 4:
                companies = "Rooftop, Lounge";
                break;
            default:
                companies = "Invalid Floor Selected";
        }
        System.out.println("Floor " + elevator + ": " + companies);


    }
}
