package CYDEO.days.day09_if_statement;

import java.util.Scanner;

public class SingleIfExample {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }

        if (false) {
            System.out.println("Bye");
        }

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distance");
        }
    }
}
