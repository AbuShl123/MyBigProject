package MyOwn.exceptions;

import java.util.Scanner; //               --Perfect example of throw exception--

public class ThrowThing {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("You are only " + age+ " wtf you're doing here? Go back and sleep \nYou are not old enough to watch this kind of videos - Access denied");
        } else {
            System.out.println("Now you get this");
            System.out.println("You old pervert! Go back and don't masturbate!!!");
        }
    }
    public static void main(String[] args) {
        System.out.println("This code will show you a porn sites that are mostly recommended from the community");
        System.out.println("How old are you?");
        Scanner sc = new Scanner(System.in);
        checkAge(sc.nextInt());

    }
}
