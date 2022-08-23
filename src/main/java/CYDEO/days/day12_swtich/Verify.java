package CYDEO.days.day12_swtich;

import java.util.Scanner;

public class Verify {
    public static void main(String[] args) {
        int pinCode = 1234;
        int ssn = 1111;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin code");
        int userPin = sc.nextInt();

        System.out.println("Enter your ssn");
        int userSsn = sc.nextInt();

        if (userPin == pinCode && userSsn == ssn) System.out.println();
            else System.out.println("Your whether pin code or ssn is wrong");


    }
}
