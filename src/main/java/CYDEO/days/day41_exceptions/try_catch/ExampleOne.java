package CYDEO.days.day41_exceptions.try_catch;

public class ExampleOne {
    public static void main(String[] args) {
        String s = null;

        // System.out.println(s.length()); this would cause a nullPointer exception - during runtime

        s = "hello";
        // System.out.println(s.charAt(10)); this would cause a IndexOutOfBounds exception - during runtime

        System.out.println("hello");

        // Thread.sleep(5000); the method has some possible checked exception, so we need to handle it before we can compile - checked - compile time
    }
}
