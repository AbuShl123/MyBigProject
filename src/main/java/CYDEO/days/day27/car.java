package CYDEO.days.day27;

import java.util.Scanner;

public class car {
    public static void unlock() {
        System.out.println("Unlocking the car");
    }

    public static void openDoor() {
        System.out.println("Opening the door of a car");
    }

    public static void sitStart() {
        System.out.println("Sitting down and in seat");
        System.out.println("Then inset the key");
        System.out.println("And starting the car");
    }

    public static void checkMirrors() {
        System.out.println("Checking left mirror");
        System.out.println("Checking rear view mirror");
        System.out.println("Checking the right mirror");
    }

    public static void belt() {
        System.out.println("Putting on seatbelt");
    }

    public static void adjustSeat() {
        System.out.println("adjusting the seat");
    }

    public static void driveGo() {
        System.out.println("Putting into drive \nPutting on the accelerator");
    }


    public static void late(int s) {
        System.out.println("Your s is " + s);
        unlock();
        openDoor();
        sitStart();
        checkMirrors();
        belt();
        adjustSeat();
        driveGo();
    }


    public static void sum(int a, int b) {
        System.out.println("The sum of your numbers is " + (a + b));
    }



    public static void main(String[] args) {
        late(12);


    }
}
