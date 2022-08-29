package CYDEO.days.day41_exceptions.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("Enter a second number");
            int b = sc.nextInt();
            System.out.println(a-b);

            String s = null;
            s.trim();
        } catch (InputMismatchException e) {
            System.out.println("Please input only numbers");
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally done");
            sc.close();
        }

    }
}
