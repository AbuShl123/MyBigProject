package CYDEO.days.day39_inheritance;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza o1 = new Pizza();
        System.out.println("Hello! Welcome to the 'DoDo Pizza!'");
        do {
            System.out.println("What size of pizza would you like?");
            o1.setSize(sc.next());

            System.out.println("Good! How much toppings?");
            o1.setNumberOfToppings(sc.nextInt());

            System.out.println("Is this your final order?");
            System.out.println(o1);

            if (sc.next().equals("yes")) break;
            else {
                System.out.println("Want to change your order? Let's start again");
            }
        } while (true);
        System.out.println("Thanks to you for ordering in our restaurant! This is your price: ");
        System.out.println("$" + o1.calculatePrice());
        System.out.println("Your pizza will come soon!");
    }
}
