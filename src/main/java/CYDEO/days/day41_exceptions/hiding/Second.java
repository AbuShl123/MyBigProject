package CYDEO.days.day41_exceptions.hiding;

public class Second extends First{

    public static void staticMethod() {
        System.out.println("This is the static method from the Second class");
    }

    public void instanceMethodB() {
        staticMethod();
    }

}
