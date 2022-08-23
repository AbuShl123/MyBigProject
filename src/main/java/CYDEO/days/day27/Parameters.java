package CYDEO.days.day27;

import java.util.Scanner;

public class Parameters {
    public  static void greeting(String name) {
        if (name.equals("Umid")) {
            System.out.println("Ты ошибка в этом мире!!! ");
        } else {
            System.out.println("Hello " + name);
            System.out.println("Nice to meet you " + name);
        }
    }


    public static void age (int age) {
        System.out.println("You are " + (2022 - age) + " years old");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greeting(sc.next());
        age(sc.nextInt());
    }
}
