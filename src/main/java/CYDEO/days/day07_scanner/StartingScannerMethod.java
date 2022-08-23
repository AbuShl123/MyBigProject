package CYDEO.days.day07_scanner;

import java.util.Scanner;


public class StartingScannerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // how to make a scanner: variable/object
        System.out.println("Please enter the number: ");
        int number = input.nextInt();
        System.out.println("This is your number: " + number);

    }
}
