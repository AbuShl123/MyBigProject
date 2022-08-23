package CYDEO.days.day36_customClass.food;

import java.util.Arrays;

public class Kitchen {
    public static void main(String[] args) {
        Food[] allFood = new Food[5];
        System.out.println(Arrays.toString(allFood));

        Food apples = new Food("Apples");
        allFood[0] = apples;
        allFood[1] = new Food("Sushi", 10);
        allFood[2] = new Food("Cake", 2, 3.99);
        allFood[3] = new Food("Kebab", 5, 5.5);
        allFood[4] = new Food("Pilaf", 4, 10.99);

        System.out.println(Arrays.toString(allFood));

        System.out.println("\nFood that has price more than $20");
        for (Food a : allFood) {
            if (a.totalPrice >= 20)
                System.out.println(a.name);

        }
    }
}
