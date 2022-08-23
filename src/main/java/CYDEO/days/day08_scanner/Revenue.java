package CYDEO.days.day08_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a price");
        int price = sc.nextInt();
        System.out.println("Enter a quantity");
        int quantity = sc.nextInt();
        System.out.println("Revenue: " + (price*quantity));


    }
}
