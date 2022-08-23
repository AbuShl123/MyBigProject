package CYDEO.Days.day21_loops;

import java.util.Scanner;

public class PrintInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to go to?");
        int range = sc.nextInt();
        boolean isPrime = true;
        for (int i = 1; i < range; i++) { // 10
            for (int j = 2; j < i; j++) { //
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            System.out.println( isPrime? i + " is prime." : i + " is not prime");
            isPrime = true;
        }
    }
}
