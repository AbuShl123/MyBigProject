package CYDEO.days.day37_static.student;

import java.util.Arrays;
import java.util.Scanner;

public class Classroom {
    public static void main(String[] args) throws InterruptedException{
        CydeoStudent.schoolInfo();

        CydeoStudent mayila = new CydeoStudent("Mayila", "Toronto", 2);

        System.out.println(mayila);
        System.out.println(Arrays.toString(mayila.instructors));// this is not recommended. Just use the class name
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.instructors[1].charAt(3));

        CydeoStudent abu = new CydeoStudent("Abu", "Almaty", 12, 4);
        System.out.println(abu);
        abu.drink();
        System.out.println(abu.myCoffee.amountLeft);
        abu.drink(); abu.drink();
        abu.addCoffee();
        System.out.println(abu.myCoffee.amountLeft);
        abu.drink();
        System.out.println(abu);

        CydeoStudent umid = new CydeoStudent("Umid", "Andizhan", 12);

        Scanner sc = new Scanner(System.in);
        System.out.println(umid);
        System.out.println("Do you want to go to work?");
        String user = sc.next();
        System.out.println("Good decision, now you will work!!!");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Welcome to hell!! ");
        System.out.println("What is your name? ");
        String n = sc.next();
        if (!n.equalsIgnoreCase(umid.name)) {
            System.out.println("LIAR! You are fired.");
            System.exit(0);
        }
        while (true) {
            System.out.println("What do you wanna do?");
            System.out.println("Drink coffee\t\tWork");
            String s = sc.next();
            if (s.equals("Work")) {
                umid.work();
            } else if (s.equals("Coffee")) {
                umid.drink();
            }
            if (umid.myCoffee.amountLeft < 2) {
                System.out.println("????????????????????????????");
                System.out.println("Do you want to update your coffee amount?");
                s = sc.next();
                if (s.equals("yes")) umid.addCoffee();
                else System.out.println("Go away");
            }
        }
    }
}
