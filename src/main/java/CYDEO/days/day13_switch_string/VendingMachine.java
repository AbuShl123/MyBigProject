package CYDEO.days.day13_switch_string;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) { //  try to catch!
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Vending machine. Select the menu " +
                "you want to see: \n\tSnacks\n\tDrinks");
        do {
            try {
                String menu = sc.next();
                if (menu.equals("Snacks")) {
                    System.out.println("Pick a snack:\n1)chips 2)Cookies 3)Pretzels 4)Candy");
                    int num = sc.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("You got chips!");
                            break;
                        case 2:
                            System.out.println("You got cookies!");
                            break;
                        case 3:
                            System.out.println("Pretzels are yummy");
                            break;
                        case 4:
                            System.out.println("You want candies?");
                            break;
                    }
                } else if (menu.equals("Drinks")) {
                    System.out.println("Pick a drink: \n1)CocaCola 2)Fanta 3)Sprite 4)Lipton");
                    int num = sc.nextInt();
                    switch (num) {
                        case 1:
                            System.out.println("You drink CocaCola!");
                            break;
                        case 2:
                            System.out.println("You love Fanta i see:)");
                            break;
                        case 3:
                            System.out.println("Sprite is a something fresh!");
                            break;
                        case 4:
                            System.out.println("Who drinks lipton, that stays speechTon!");
                            break;
                    }
                }
                System.out.println("Select the menu you want to see: \n\tSnacks\n\tDrinks");
            } catch (Exception e) {
                System.out.println("Bye bye!!");
                break;
            }
        } while (true);
    }
}
