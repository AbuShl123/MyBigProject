package CYDEO.days.day09_if_statement;

import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println("Enter your email");
        String email = input.next();
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Do you want to sigh up for extra newsletter? T/F");
        boolean extra = input.nextBoolean();
        System.out.println("How did you hear about us");
        input.nextLine();
        String hearUs = input.nextLine();

        String confirm = fullName + " you signed up! With email " + email + ". We are glad to get readers at age " + age + ". You signed up for extra newsletter: " + extra + ". Credit goes to " + hearUs;

        System.out.println(confirm);
    }
}
