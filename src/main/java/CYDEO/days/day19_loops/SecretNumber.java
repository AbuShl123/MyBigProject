package CYDEO.Days.day19_loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        int serNum = 72;
        int inNum;
        int attempts = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Guess the number");
            inNum = sc.nextInt();

            if (inNum < serNum) System.out.println("Secret number is higher");
            else if (inNum > serNum) System.out.println("Secret number is lower" );

            attempts++;
        } while (serNum != inNum);

        System.out.println("You guessed the number in " + attempts + " attempts");
    }
}
