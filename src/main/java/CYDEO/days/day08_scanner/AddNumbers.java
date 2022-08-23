package CYDEO.days.day08_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("There is your result: " + (a + b));


    }
}
