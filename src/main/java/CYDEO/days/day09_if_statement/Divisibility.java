package CYDEO.days.day09_if_statement;

public class Divisibility {
    public static void main(String[] args) {

        int n = 300;

        if (n%2 == 0) {
            System.out.println(n + " is divisible by 2");
        }

        if (n % 3 == 0) {
            System.out.println(n + " is divisible by 3");
        }

        if (n % 5 == 0) {
            System.out.println(n + " is divisible by 5");
        }
    }
}
