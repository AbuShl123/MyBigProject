package CYDEO.Days.day18_loops;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = -2147483648;
        int min = 2147483647;
        int num = 0;
        while (num++ < 5) {
            System.out.println("Enter a number");
            int u = sc.nextInt();
            if (u > max) max = u;
            if (u < min) min = u;
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
