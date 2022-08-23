package CYDEO.Days.day18_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int validPin = 1234;
        int userPin;
        int attempt = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your pin");
            userPin = sc.nextInt();
            attempt++;
        } while (attempt < 3 && userPin != validPin);

        if (userPin == validPin) {
            System.out.println("Logged in");
        } else {
            System.out.println("Locked account, too many attempts");
        }
    }
}
