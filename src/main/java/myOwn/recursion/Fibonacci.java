package myOwn.recursion;

import java.util.Scanner;

public class Fibonacci {
    static int b = 0, n = 1, c = 0;
    static void FiboNum(int count) { //  0 1  1
        if (count > 0) {
            c = b + n;
            b = n;
            n = c;
            System.out.print(" " + c);
            FiboNum(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        System.out.print(b + " " + n);
        FiboNum(count);
    }
}
