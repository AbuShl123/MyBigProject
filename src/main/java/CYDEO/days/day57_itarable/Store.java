package CYDEO.days.day57_itarable;

import java.util.*;

public class Store {
    static List<String> products = new ArrayList<>();
    static double price;
    static Map<String, Double> store = new HashMap<>(
            Map.of("Water", 2.99, "Chocolate", 3.1, "Bread", 4.55, "Milk", 2.89, "Fruits", 3.31)
    );
    static double bankCard = 20.4;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(store);
        System.out.println("What item would you like? ");
        while (true) {
            String item = fixString(sc.next());
            if (item.equalsIgnoreCase("x")) break;
            if (store.containsKey(item)) {
                products.add(item);
                System.out.println(item + " is in the stock, and it costs: " + store.get(item));
                System.out.println("You have : " + products);
                System.out.println("Print: 'x' to finish shopping");
            } else {
                System.out.println("Sorry, we don't have any " + item + "s :( ");
                System.out.println("Please choose another one from the list: ");
                System.out.println(store);
            }
        }

        System.out.println("This is your list of products: ");
        System.out.println(products);

        countPrice();

        System.out.println("To pay: " + price + "$");
        System.out.println("You have: " + bankCard + " in your bank account");

        while (price > bankCard) {
            System.out.println("You don't have enough money to pay for!");
            System.out.println("Please enter the name of the product you would like to remove from the list: ");
            removeItem(fixString(sc.next()));
        }
        bankCard -= price;
        System.out.println("Well done!! Now you have: " + bankCard + " in your account!!!");
        System.out.println("Thanks for the shopping, come again:)))))))");
    }

    public static String fixString(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void removeItem(String name) {
        products.remove(name);
        price -= store.get(name);
    }

    public static void countPrice() {
        for (String v : products) {
            price += store.get(v);
        }
    }
}
