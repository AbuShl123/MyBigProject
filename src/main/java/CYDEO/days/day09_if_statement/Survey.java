package CYDEO.days.day09_if_statement;

import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isStudent = sc.nextBoolean();

        if (isStudent) {
            System.out.println("What are you studying?");
            String subject = sc.next();
            System.out.println(subject);
        }

        System.out.println("Do you live in a city?");

        if (sc.nextBoolean()) {
            System.out.println("Cool, cities are loud and fun");
        } else {
            System.out.println("How many years have you lived in the suburb");
            int years = sc.nextInt();
            System.out.println(years);
        }
    }
}
