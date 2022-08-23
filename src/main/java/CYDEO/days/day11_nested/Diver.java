package CYDEO.days.day11_nested;

public class Diver {
    public static void main(String[] args) {
        int a = 34;

        if (a >= 90) {
            System.out.println("Your is full");
        } else if (a >= 80) {
            System.out.println("Sill ok");
        } else if (a >= 70) {
            System.out.println("Don't go too far");
        } else if (a >= 60) {
            System.out.println("Start to head back");
        } else if (a >= 50) {
            System.out.println("Be careful, now you at 50%");
        }
    }
}
