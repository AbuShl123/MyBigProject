package CYDEO.Days.day20_loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isP = true;

        if (num < 2) {
            System.out.println("This is not a prime number");
            System.exit(0);
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isP = false;
                break;
            }
        }
        if (isP) System.out.println(num + " is a prime number");
        else System.out.println("This is not a prime number");
    }
}
