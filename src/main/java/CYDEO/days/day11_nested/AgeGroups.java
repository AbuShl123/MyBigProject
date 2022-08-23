package CYDEO.days.day11_nested;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 0 && age <= 120) {
            if (age <= 1) System.out.println("Baby");
            else if (age <= 5) System.out.println("Toddler");
            else if (age <= 13) System.out.println("Kid");
            else if (age <= 17) System.out.println("Teenager");
            else if (age <= 30) System.out.println("Young adult");
            else if (age <= 65) System.out.println("Adult");
            else System.out.println("Dinosaur");

        } else {
            System.out.println("Go away poltergeist");
        }
    }
}
