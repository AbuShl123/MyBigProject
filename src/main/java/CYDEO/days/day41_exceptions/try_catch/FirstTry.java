package CYDEO.days.day41_exceptions.try_catch;

public class FirstTry {
    public static void main(String[] args) {
        try {

            String s = "Hello World";
            System.out.println(s.charAt(-1));
            System.out.println(s.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("the string was too short it went out of bounds");
        }


        System.out.println("Hello");

        try {
            Thread.sleep(-5000);
        } catch (Exception e) {
            System.out.println("invalid time given");
        }

        System.out.println("World");
    }
}
