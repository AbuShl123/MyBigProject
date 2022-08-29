package CYDEO.days.day41_exceptions.try_catch;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            System.out.println(1/5);

            String s = null;
            s.trim();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("END!");
    }
}
