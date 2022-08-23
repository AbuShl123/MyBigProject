package CYDEO.days.day28_methods;

import java.util.Scanner;

public class Numbers {
    public static void checkNum(int c)  {
        if (c > 0) System.out.println("Positive");
        else if (c < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }


    public static void main(String[] args) {
        checkNum(12);
        checkNum(0);
        checkNum(-34);

        checkNum(new Scanner(System.in).nextInt());

        int n = 3;
        checkNum(n);
    }
}
